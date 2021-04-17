package com.path_studio.moviecatalogue.ui.movie

import androidx.lifecycle.ViewModel
import com.path_studio.moviecatalogue.data.MovieEntity
import com.path_studio.moviecatalogue.util.DataDummy

class MovieViewModel: ViewModel() {
    fun getMovies(): List<MovieEntity> = DataDummy.generateDummyMovie()
}