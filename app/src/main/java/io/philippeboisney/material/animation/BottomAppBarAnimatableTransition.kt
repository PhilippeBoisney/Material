package io.philippeboisney.material.animation

import android.animation.*
import android.content.Context
import android.util.AttributeSet
import android.annotation.TargetApi
import android.graphics.drawable.Animatable
import android.os.Build
import android.view.View
import androidx.core.view.forEach
import com.google.android.material.bottomappbar.BottomAppBar
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
import androidx.core.view.get
import io.philippeboisney.material.R

@TargetApi(Build.VERSION_CODES.LOLLIPOP)
class BottomAppBarAnimatableTransition(context: Context, attrs: AttributeSet) : BaseForcedTransition(context, attrs) {

    private var onAppear: Boolean = false

    init {
        val a = context.obtainStyledAttributes(attrs, R.styleable.BottomAppBarAnimatable)
        onAppear = a.getBoolean(R.styleable.BottomAppBarAnimatable_onAppear, onAppear)
        a.recycle()
    }

    override fun getAnimator(view: View): Animator
        = createAnimation(view)

    // ---

    private fun createAnimation(view: View): ValueAnimator {
        val bottomAppBar = view as BottomAppBar
        val context = bottomAppBar.context
        if (onAppear) {
            bottomAppBar.menu[2].icon = AnimatedVectorDrawableCompat.create(context, R.drawable.avd_search_to_more)
            bottomAppBar.menu[1].icon = AnimatedVectorDrawableCompat.create(context, R.drawable.avd_delete_scale_up)
            bottomAppBar.menu[0].icon = AnimatedVectorDrawableCompat.create(context, R.drawable.avd_star_scale_up)
        } else {
            bottomAppBar.menu[2].icon = AnimatedVectorDrawableCompat.create(context, R.drawable.avd_more_to_search)
            bottomAppBar.menu[1].icon = AnimatedVectorDrawableCompat.create(context, R.drawable.avd_delete_scale_down)
            bottomAppBar.menu[0].icon = AnimatedVectorDrawableCompat.create(context, R.drawable.avd_star_scale_down)
        }

        val transition = ValueAnimator.ofInt(0, 1)
        transition.addListener(object : AnimatorListenerAdapter() {
            override fun onAnimationStart(animation: Animator) {
                bottomAppBar.menu.forEach { (it.icon as? Animatable)?.start() }
            }
        })
        return transition!!
    }
}