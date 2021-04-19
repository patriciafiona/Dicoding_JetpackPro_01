package com.path_studio.moviecatalogue.ui.mainPage

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.path_studio.moviecatalogue.R
import com.path_studio.moviecatalogue.util.DataDummy
import com.path_studio.moviecatalogue.util.Utils
import org.junit.Rule
import org.junit.Test


class MainActivityTest{
    private val dummyMovie = DataDummy.generateDummyMovie()
    private val dummyTvShow = DataDummy.generateTvShow()

    @get:Rule
    var activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun loadMovie() {
        onView(withId(R.id.navigation_movie)).perform(click())
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovie.size))
    }

    @Test
    fun loadDetailMovie() {
        onView(withId(R.id.navigation_movie)).perform(click())
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))

        onView(withId(R.id.movieTitle)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
        onView(withId(R.id.movieTitle)).check(matches(withText(dummyMovie[0].title)))
        onView(withId(R.id.movieTopTitle)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
        onView(withId(R.id.movieTopTitle)).check(matches(withText(dummyMovie[0].title)))

        onView(withId(R.id.movieRating)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))

        onView(withId(R.id.movieReleaseDate)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
        onView(withId(R.id.movieReleaseDate)).check(matches(withText(
                Utils.changeStringToDateFormat(
                        dummyMovie[0].releaseDate
                )
        )))

        onView(withId(R.id.movieDuration)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
        onView(withId(R.id.movieDuration)).check(matches(withText(
                Utils.changeMinuteToDurationFormat(
                        dummyMovie[0].duration
                )
        )))

        onView(withId(R.id.movieSinopsis)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
        onView(withId(R.id.movieSinopsis)).check(matches(withText(dummyMovie[0].description)))
        onView(withId(R.id.btnFavoriteMovie)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
        onView(withId(R.id.movieTrailer)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
        onView(withId(R.id.moviePoster)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
        onView(withId(R.id.movieBackdrop)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))

        onView(withId(R.id.btnBackPage)).perform(click())
    }

    @Test
    fun loadTvShow() {
        onView(withId(R.id.navigation_tvShow)).perform(click())
        onView(withId(R.id.rv_tvShow)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_tvShow)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyTvShow.size))
    }

    @Test
    fun loadDetailTvShow() {
        onView(withId(R.id.navigation_tvShow)).perform(click())
        onView(withId(R.id.rv_tvShow)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))

        onView(withId(R.id.showTitle)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
        onView(withId(R.id.showTitle)).check(matches(withText(dummyTvShow[0].title)))
        onView(withId(R.id.showTopTitle)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
        onView(withId(R.id.showTopTitle)).check(matches(withText(dummyTvShow[0].title)))

        onView(withId(R.id.showRating)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))

        onView(withId(R.id.showReleaseDate)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
        onView(withId(R.id.showReleaseDate)).check(matches(withText(
                dummyTvShow[0].seasonDetails[dummyTvShow[0].seasonDetails.size -1].sessionPremiere
        )))

        onView(withId(R.id.showDuration)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
        onView(withId(R.id.showDuration)).check(matches(withText(
                Utils.changeMinuteToDurationFormat(
                        dummyTvShow[0].duration
                )
        )))

        onView(withId(R.id.showSinopsis)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
        onView(withId(R.id.showSinopsis)).check(matches(withText(dummyTvShow[0].overview)))
        onView(withId(R.id.btnFavoriteshow)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
        onView(withId(R.id.showTrailer)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
        onView(withId(R.id.showPoster)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
        onView(withId(R.id.showBackdrop)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))

        onView(withId(R.id.rv_seasonDetail)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_seasonDetail)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyTvShow[0].seasonDetails.size))

        onView(withId(R.id.btnBackPage02)).perform(click())
    }

    @Test
    fun testMovieListExpansion() {
        onView(withId(R.id.navigation_movie)).perform(click())
        onView(withId(R.id.indicatorImage)).perform(click()) //expand page
        onView(withId(R.id.indicatorImage)).perform(click())// minimize expand page
    }

    @Test
    fun testTvShowListExpansion() {
        onView(withId(R.id.navigation_tvShow)).perform(click())
        onView(withId(R.id.indicatorImage2)).perform(click()) //expand page
        onView(withId(R.id.indicatorImage2)).perform(click())// minimize expand page
    }
}