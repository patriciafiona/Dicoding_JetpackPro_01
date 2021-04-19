package com.path_studio.moviecatalogue.ui.detailMovie

import com.path_studio.moviecatalogue.util.DataDummy
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test

class DetailMovieViewModelTest {

    private lateinit var viewModel: DetailMovieViewModel
    private val dummyMovie = DataDummy.generateDummyMovie()[0]
    private val movieId = dummyMovie.id

    @Before
    fun setUp() {
        viewModel = DetailMovieViewModel()
    }

    @Test
    fun getMovies() {
        viewModel.setSelectedMovie(movieId)
        val movieEntity = viewModel.getMovies()

        assertNotNull(movieEntity)

        assertEquals(dummyMovie.id, movieEntity.id)
        assertEquals(dummyMovie.title, movieEntity.title)
        assertEquals(dummyMovie.description, movieEntity.description)
        assertEquals(dummyMovie.releaseDate, movieEntity.releaseDate)
        assertEquals(dummyMovie.genre, movieEntity.genre)
        assertEquals(dummyMovie.duration, movieEntity.duration)
        assertEquals(dummyMovie.rating.toString(), movieEntity.rating.toString())
        assertEquals(dummyMovie.backdropURL, movieEntity.backdropURL)
        assertEquals(dummyMovie.posterURL, movieEntity.posterURL)
        assertEquals(dummyMovie.youtubeVideoURL, movieEntity.youtubeVideoURL)
    }
}