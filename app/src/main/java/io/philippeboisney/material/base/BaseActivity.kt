package io.philippeboisney.material.base

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatDrawableManager
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.floatingactionbutton.FloatingActionButton
import io.philippeboisney.material.R

abstract class BaseActivity: AppCompatActivity() {

    override fun onResume() {
        super.onResume()
        configureBottomAppBar()
    }

    // ---

    abstract fun getMenu(): Int
    abstract fun getFabIcon(): Int

    // ---

    private fun configureBottomAppBar() {
        val bottomBar = findViewById<BottomAppBar>(R.id.bar)
        val fab = findViewById<FloatingActionButton>(R.id.fab)
        bottomBar.replaceMenu(getMenu())
        fab.setImageDrawable(AppCompatDrawableManager.get().getDrawable(this, getFabIcon()))
    }
}