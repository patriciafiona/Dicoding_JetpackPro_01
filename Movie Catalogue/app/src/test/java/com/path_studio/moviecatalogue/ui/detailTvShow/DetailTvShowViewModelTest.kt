package com.path_studio.moviecatalogue.ui.detailTvShow

import com.path_studio.moviecatalogue.ui.detailMovie.DetailMovieViewModel
import com.path_studio.moviecatalogue.util.DataDummy
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailTvShowViewModelTest {

    private lateinit var viewModel: DetailTvShowViewModel
    private val dummyTvShow = DataDummy.generateTvShow()[0]
    private val tvShowId = dummyTvShow.id

    @Before
    fun setUp() {
        viewModel = DetailTvShowViewModel()
    }

    @Test
    fun getShows() {
        viewModel.setSelectedShow(tvShowId)
        val tvShowEntity = viewModel.getShows()

        assertNotNull(tvShowEntity)

        assertEquals(dummyTvShow.id, tvShowEntity.id)
        assertEquals(dummyTvShow.title, tvShowEntity.title)
        assertEquals(dummyTvShow.overview, tvShowEntity.overview)
        assertEquals(dummyTvShow.genre, tvShowEntity.genre)
        assertEquals(dummyTvShow.duration, tvShowEntity.duration)
        assertEquals(dummyTvShow.seasonDetails, tvShowEntity.seasonDetails)
        assertEquals(dummyTvShow.rating.toString(), tvShowEntity.rating.toString())
        assertEquals(dummyTvShow.backdropURL, tvShowEntity.backdropURL)
        assertEquals(dummyTvShow.posterURL, tvShowEntity.posterURL)
        assertEquals(dummyTvShow.trailerURL, tvShowEntity.trailerURL)
    }
}