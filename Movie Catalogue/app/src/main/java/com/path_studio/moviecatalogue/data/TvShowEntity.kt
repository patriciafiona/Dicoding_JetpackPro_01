package com.path_studio.moviecatalogue.data

data class TvShowEntity (
    var id: Long,
    var title: String,
    var description: String,
    var releaseDate: String,
    var genre: ArrayList<String>,
    var duration: Int, //in minutes
    var rating: Double,
    var backdropURL: String,
    var posterURL: String,
    var trailerURL: String
)