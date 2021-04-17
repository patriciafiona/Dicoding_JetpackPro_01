package com.path_studio.moviecatalogue.ui.detailMovie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.path_studio.moviecatalogue.R

class DetailMovieActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_MOVIE = "extra_movie"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_movie)
    }
}