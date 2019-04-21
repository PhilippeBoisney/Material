package io.philippeboisney.material

import android.os.Build
import android.os.Bundle
import android.transition.Fade
import io.philippeboisney.material.base.BaseActivity

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun getMenu(): Int
            = R.menu.bottomappbar_menu_list

    override fun getFabIcon(): Int
            = R.drawable.ic_edit_black_24dp
}
