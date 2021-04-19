package com.path_studio.moviecatalogue.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TvShowEntity (
        var id: Long,
        var title: String,
        var overview: String,
        var genre: ArrayList<String>,
        var rating: Double,
        var duration: Int,
        var seasonDetails: ArrayList<TvShowSeasonEntity>,
        var backdropURL: String,
        var posterURL: String,
        var trailerURL: String
): Parcelable