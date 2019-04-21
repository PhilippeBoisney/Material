package io.philippeboisney.material.animation

import android.animation.Animator
import android.annotation.TargetApi
import android.content.Context
import android.os.Build
import android.transition.Transition
import android.transition.TransitionValues
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup

@TargetApi(Build.VERSION_CODES.LOLLIPOP)
abstract class BaseForcedTransition(context: Context, attrs: AttributeSet) : Transition(context, attrs) {

    override fun captureStartValues(p0: TransitionValues?) {
        p0!!.values["dummy"] = "dummy"
    }

    override fun captureEndValues(p0: TransitionValues?) {
        p0!!.values["dummy"] = "other_dummy"
    }

    override fun createAnimator(
        sceneRoot: ViewGroup?,
        startValues: TransitionValues?,
        endValues: TransitionValues?
    ): Animator {
        return getAnimator(endValues!!.view)
    }

    // ---

    abstract fun getAnimator(view: View): Animator
}