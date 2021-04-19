package com.path_studio.moviecatalogue.ui.tvShow

import androidx.lifecycle.ViewModel
import com.path_studio.moviecatalogue.data.TvShowEntity
import com.path_studio.moviecatalogue.util.DataDummy

class TvShowViewModel: ViewModel() {
    fun getTvShow(): List<TvShowEntity> = DataDummy.generateTvShow()
}