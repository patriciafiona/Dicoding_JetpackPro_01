package com.path_studio.moviecatalogue.ui.detailMovie

import android.app.ActionBar
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.path_studio.moviecatalogue.R
import com.path_studio.moviecatalogue.data.MovieEntity
import com.path_studio.moviecatalogue.databinding.ActivityDetailMovieBinding
import com.path_studio.moviecatalogue.util.Utils.changeStringToDateFormat
import java.util.*

class DetailMovieActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailMovieBinding

    companion object {
        const val EXTRA_MOVIE = "extra_movie"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailMovieBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[DetailMovieViewModel::class.java]

        val extras = intent.extras
        if (extras != null) {
            val movieId = extras.getLong(EXTRA_MOVIE)
            if (movieId != 0L) {
                viewModel.setSelectedMovie(movieId)
                val movieDetails = viewModel.getMovies()
                showDetailMovie(viewModel.getMovies() as MovieEntity)
            }
        }

        binding.btnBackPage.setOnClickListener {
            super.onBackPressed() // or super.finish();
        }
    }

    private fun showDetailMovie(movieEntity: MovieEntity) {
        binding.movieTopTitle.text = movieEntity.title
        binding.movieTitle.text = movieEntity.title
        binding.movieSinopsis.text = movieEntity.description

        binding.movieReleaseDate.text = changeStringToDateFormat(movieEntity.releaseDate)

        binding.movieRating.rating = movieEntity.rating.toFloat()/20

        Glide.with(this)
                .load(movieEntity.posterURL)
                .transform(RoundedCorners(20))
                .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                                .error(R.drawable.ic_error))
                .into(binding.moviePoster)

        Glide.with(this)
                .load(movieEntity.backdropURL)
                .transform(RoundedCorners(20))
                .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                                .error(R.drawable.ic_error))
                .into(binding.movieBackdrop)
        binding.movieBackdrop.alpha = 0.5F

        for (genre in movieEntity.genre){
            //set the properties for button

            //set the properties for button
            val btnTag = Button(this)
            btnTag.layoutParams = ActionBar.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.WRAP_CONTENT)
            btnTag.text = genre

            //add button to the layout
            binding.movieGenres.addView(btnTag);
        }
    }
}