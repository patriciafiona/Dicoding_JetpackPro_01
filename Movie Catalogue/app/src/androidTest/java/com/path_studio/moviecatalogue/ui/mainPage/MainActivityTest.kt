package com.path_studio.moviecatalogue.ui.mainPage

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.bumptech.glide.util.Util
import com.path_studio.moviecatalogue.R
import com.path_studio.moviecatalogue.util.DataDummy
import com.path_studio.moviecatalogue.util.Utils
import org.junit.Rule
import org.junit.Test

class MainActivityTest{
    private val dummyMovie = DataDummy.generateDummyMovie()

    @get:Rule
    var activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun loadMovie() {
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovie.size))
    }

    @Test
    fun loadDetailMovie() {
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))

        onView(withId(R.id.movieTitle)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
        onView(withId(R.id.movieTitle)).check(matches(withText(dummyMovie[0].title)))
        onView(withId(R.id.movieTopTitle)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
        onView(withId(R.id.movieTopTitle)).check(matches(withText(dummyMovie[0].title)))

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
    }

}