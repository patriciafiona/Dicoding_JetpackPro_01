package com.path_studio.moviecatalogue.data

data class TvShowSessionEntity(
        var showId: Long,
        var sessionId: Int,
        var sessionPremiere: String,
        var totalEpisode: Int,
        var sessionOverview: String,
        var posterURL: String
)
