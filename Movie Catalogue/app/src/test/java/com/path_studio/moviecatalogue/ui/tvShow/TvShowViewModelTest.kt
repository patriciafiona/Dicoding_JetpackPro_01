package com.path_studio.moviecatalogue.ui.tvShow

import com.path_studio.moviecatalogue.data.TvShowEntity
import com.path_studio.moviecatalogue.ui.movie.MovieViewModel
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class TvShowViewModelTest {

    private lateinit var viewModel: TvShowViewModel
    @Before
    fun setUp() {
        viewModel = TvShowViewModel()
    }

    @Test
    fun getTvShow() {
        val tvShowEntity = viewModel.getTvShow()
        assertNotNull(tvShowEntity)
        assertEquals(11, tvShowEntity.size)
    }
}