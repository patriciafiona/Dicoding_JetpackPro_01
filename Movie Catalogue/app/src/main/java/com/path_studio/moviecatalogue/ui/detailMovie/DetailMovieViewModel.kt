package com.path_studio.moviecatalogue.ui.detailMovie

import androidx.lifecycle.ViewModel
import com.path_studio.moviecatalogue.data.MovieEntity
import com.path_studio.moviecatalogue.util.DataDummy

class DetailMovieViewModel: ViewModel(){

    private var movieId: Long = 0L

    fun setSelectedMovie(movieId: Long) {
        this.movieId = movieId
    }

    fun getMovies(): MovieEntity {
        lateinit var movie: MovieEntity
        val moviesEntities = DataDummy.generateDummyMovie()
        for (movieEntity in moviesEntities) {
            if (movieEntity.id == movieId) {
                movie = movieEntity
            }
        }
        return movie
    }

}