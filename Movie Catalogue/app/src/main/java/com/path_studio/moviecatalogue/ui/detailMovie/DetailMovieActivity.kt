package com.path_studio.moviecatalogue.ui.detailMovie

import android.annotation.SuppressLint
import android.app.ActionBar
import android.os.Bundle
import android.view.View
import android.webkit.*
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.faltenreich.skeletonlayout.Skeleton
import com.path_studio.moviecatalogue.R
import com.path_studio.moviecatalogue.data.MovieEntity
import com.path_studio.moviecatalogue.databinding.ActivityDetailMovieBinding
import com.path_studio.moviecatalogue.util.Utils.changeMinuteToDurationFormat
import com.path_studio.moviecatalogue.util.Utils.changeStringToDateFormat
import com.path_studio.moviecatalogue.util.Utils.showAlert


class DetailMovieActivity : AppCompatActivity(){

    private lateinit var binding: ActivityDetailMovieBinding
    private lateinit var skeleton: Skeleton

    private lateinit var movieDetails: MovieEntity

    companion object {
        const val EXTRA_MOVIE = "extra_movie"
        const val EXTRA_STATE = "EXTRA_STATE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailMovieBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //init Skeleton
        skeleton = binding.skeletonLayout

        //show loading indicator
        showLoading(true)
        showYoutubeLoading(true)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[DetailMovieViewModel::class.java]

        val extras = intent.extras
        if (extras != null) {
            val movieId = extras.getLong(EXTRA_MOVIE)
            if (movieId != 0L) {
                viewModel.setSelectedMovie(movieId)
                movieDetails = viewModel.getMovies()
                showDetailMovie(movieDetails)
            }
        }

        binding.btnBackPage.setOnClickListener {
            super.onBackPressed() // or super.finish();
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_STATE, movieDetails)
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private fun showDetailMovie(movieEntity: MovieEntity) {
        if (movieEntity.title.isNotEmpty()){
            showLoading(false)

            binding.movieTopTitle.text = movieEntity.title
            binding.movieTitle.text = movieEntity.title
            binding.movieSinopsis.text = movieEntity.description

            binding.movieReleaseDate.text = changeStringToDateFormat(movieEntity.releaseDate)

            binding.movieRating.rating = movieEntity.rating.toFloat()/20

            binding.movieDuration.text = changeMinuteToDurationFormat(movieEntity.duration)

            Glide.with(this)
                .load(movieEntity.posterURL)
                .transform(RoundedCorners(20))
                .apply(
                    RequestOptions.placeholderOf(R.drawable.ic_loading)
                        .error(R.drawable.ic_error)
                )
                .into(binding.moviePoster)

            Glide.with(this)
                .load(movieEntity.backdropURL)
                .transform(RoundedCorners(20))
                .apply(
                    RequestOptions.placeholderOf(R.drawable.ic_loading)
                        .error(R.drawable.ic_error)
                )
                .into(binding.movieBackdrop)
            binding.movieBackdrop.alpha = 0.5F

            for (genre in movieEntity.genre){
                //set the properties for button
                val btnTag = Button(this)

                //set margin and create button
                val params: ActionBar.LayoutParams = ActionBar.LayoutParams(
                    ActionBar.LayoutParams.WRAP_CONTENT,
                    ActionBar.LayoutParams.WRAP_CONTENT
                )
                params.setMargins(0, 0, 20, 0)

                btnTag.layoutParams = ActionBar.LayoutParams(params)
                btnTag.text = genre
                btnTag.background = this.getDrawable(R.drawable.rounded_button)

                //set padding
                btnTag.setPadding(15, 10, 15, 10)

                //add button to the layout
                binding.movieGenres.addView(btnTag)
            }

            //set video in webview
            setVideoWebView(movieEntity.youtubeVideoURL)
        }
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun setVideoWebView(youtubeURL: String){
        binding.movieTrailer.webViewClient = object : WebViewClient() {
            override fun onPageFinished(view: WebView, url: String) {
                showYoutubeLoading(false)
            }

            override fun onReceivedError(
                view: WebView?,
                request: WebResourceRequest?,
                error: WebResourceError?
            ) {
                showAlert(this@DetailMovieActivity, "Failed to get Trailer Video")
            }

            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                return false
            }
        }
        val webSettings: WebSettings = binding.movieTrailer.settings
        webSettings.javaScriptEnabled = true
        binding.movieTrailer.loadUrl(youtubeURL)
    }

    private fun showLoading(state: Boolean) {
        if (state) {
            skeleton.showSkeleton()
        } else {
            skeleton.showOriginal()
        }
    }

    private fun showYoutubeLoading(state: Boolean) {
        if (state) {
            binding.youtubeProgressBar.visibility = View.VISIBLE
        } else {
            binding.youtubeProgressBar.visibility = View.GONE
        }
    }
}