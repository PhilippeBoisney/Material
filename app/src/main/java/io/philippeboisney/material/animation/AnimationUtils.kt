package io.philippeboisney.material.animation

import android.app.Activity
import android.os.Build
import android.view.View
import android.view.Window
import androidx.core.app.ActivityOptionsCompat
import androidx.core.util.Pair

/**
 * Convenient method to avoid the Navigation Bar to blink during transitions on some devices
 * @see https://stackoverflow.com/questions/26600263/how-do-i-prevent-the-status-bar-and-navigation-bar-from-animating-during-an-acti
 */
fun makeSceneTransitionAnimation(activity: Activity, vararg pairs: Pair<View, String>): ActivityOptionsCompat {
    val updatedPairs = pairs.toMutableList()
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        val navBar = activity.findViewById<View>(android.R.id.navigationBarBackground)
        if (navBar != null) {
            updatedPairs.add(Pair(navBar, Window.NAVIGATION_BAR_BACKGROUND_TRANSITION_NAME))
        }
    }
    return ActivityOptionsCompat.makeSceneTransitionAnimation(activity, *updatedPairs.toTypedArray())
}