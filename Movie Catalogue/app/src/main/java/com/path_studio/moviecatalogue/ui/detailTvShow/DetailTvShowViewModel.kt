package com.path_studio.moviecatalogue.ui.detailTvShow

import androidx.lifecycle.ViewModel
import com.path_studio.moviecatalogue.data.MovieEntity
import com.path_studio.moviecatalogue.data.TvShowEntity
import com.path_studio.moviecatalogue.util.DataDummy

class DetailTvShowViewModel:ViewModel() {

    private var showId: Long = 0L

    fun setSelectedShow(showId: Long) {
        this.showId = showId
    }

    fun getShows(): TvShowEntity {
        lateinit var show: TvShowEntity
        val showsEntity = DataDummy.generateTvShow()
        for (showEntity in showsEntity) {
            if (showEntity.id == showId) {
                show = showEntity
            }
        }
        return show
    }

}