package com.path_studio.moviecatalogue.data

data class TvShowEntity (
    var id: Long,
    var title: String,
    var overview: String,
    var genre: ArrayList<String>,
    var rating: Double,
    var duration: Int,
    var sessionDetails: ArrayList<TvShowSessionEntity>,
    var backdropURL: String,
    var posterURL: String,
    var trailerURL: String
)