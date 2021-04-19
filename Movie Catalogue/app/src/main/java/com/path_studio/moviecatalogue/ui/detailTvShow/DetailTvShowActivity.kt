package com.path_studio.moviecatalogue.ui.detailTvShow

import android.annotation.SuppressLint
import android.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.webkit.*
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.faltenreich.skeletonlayout.Skeleton
import com.path_studio.moviecatalogue.R
import com.path_studio.moviecatalogue.data.TvShowEntity
import com.path_studio.moviecatalogue.databinding.ActivityDetailTvShowBinding
import com.path_studio.moviecatalogue.ui.movie.MovieAdapter
import com.path_studio.moviecatalogue.ui.movie.MovieViewModel
import com.path_studio.moviecatalogue.util.Utils

class DetailTvShowActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailTvShowBinding
    private lateinit var skeleton: Skeleton

    companion object {
        const val EXTRA_TV_SHOW = "extra_tv_show"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailTvShowBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //init Skeleton
        skeleton = binding.skeletonLayout

        //show loading indicator
        showLoading(true)
        showYoutubeLoading(true)

        //prepare view model for show Tv Show Details
        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[DetailTvShowViewModel::class.java]

        val extras = intent.extras
        if (extras != null) {
            val showId = extras.getLong(EXTRA_TV_SHOW)
            Log.e("showId", showId.toString())
            if (showId != 0L) {
                viewModel.setSelectedShow(showId)
                val showDetails = viewModel.getShows()

                val listOfSeason = showDetails.seasonDetails
                val seasonAdapter = SeasonDetailAdapter()
                seasonAdapter.setSeason(listOfSeason)

                with(binding.rvSeasonDetail) {
                    layoutManager = LinearLayoutManager(context)
                    setHasFixedSize(true)
                    adapter = seasonAdapter
                    showLoading(false)
                }

                showDetailShow(showDetails)
            }
        }

        binding.btnBackPage.setOnClickListener {
            super.onBackPressed() // or super.finish();
        }
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private fun showDetailShow(tvShowEntity: TvShowEntity) {
        if (tvShowEntity.title.isNotEmpty()){
            showLoading(false)

            binding.showTopTitle.text = tvShowEntity.title
            binding.showTitle.text = tvShowEntity.title
            binding.showSinopsis.text = tvShowEntity.overview

            binding.showReleaseDate.text = tvShowEntity.seasonDetails[tvShowEntity.seasonDetails.size - 1].sessionPremiere

            binding.showRating.rating = tvShowEntity.rating.toFloat()/20

            binding.showDuration.text = Utils.changeMinuteToDurationFormat(tvShowEntity.duration)

            Glide.with(this)
                .load(tvShowEntity.posterURL)
                .transform(RoundedCorners(20))
                .apply(
                    RequestOptions.placeholderOf(R.drawable.ic_loading)
                        .error(R.drawable.ic_error)
                )
                .into(binding.showPoster)

            Glide.with(this)
                .load(tvShowEntity.backdropURL)
                .transform(RoundedCorners(20))
                .apply(
                    RequestOptions.placeholderOf(R.drawable.ic_loading)
                        .error(R.drawable.ic_error)
                )
                .into(binding.showBackdrop)
            binding.showBackdrop.alpha = 0.5F

            for (genre in tvShowEntity.genre){
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
                binding.showGenres.addView(btnTag)
            }

            //set video in webview
            setVideoWebView(tvShowEntity.trailerURL)
        }
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun setVideoWebView(youtubeURL: String){
        binding.showTrailer.webViewClient = object : WebViewClient() {
            override fun onPageFinished(view: WebView, url: String) {
                showYoutubeLoading(false)
            }

            override fun onReceivedError(
                view: WebView?,
                request: WebResourceRequest?,
                error: WebResourceError?
            ) {
                Utils.showAlert(this@DetailTvShowActivity, "Failed to get Trailer Video")
            }

            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                return false
            }
        }
        val webSettings: WebSettings = binding.showTrailer.settings
        webSettings.javaScriptEnabled = true
        binding.showTrailer.loadUrl(youtubeURL)
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