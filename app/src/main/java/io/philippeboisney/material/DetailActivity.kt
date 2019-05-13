package io.philippeboisney.material

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.navArgs
import io.philippeboisney.material.base.BaseActivity



/**
 * A simple [Fragment] subclass.
 */
class DetailActivity : BaseActivity() {

    private val args: DetailActivityArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        findNavController(R.id.activity_detail_nav_host_fragment)
            .setGraph(R.navigation.nav_graph_detail, args.toBundle())
    }

    override fun getMenu(): Int
        = R.menu.bottomappbar_menu_detail

    override fun getFabIcon(): Int
        = R.drawable.ic_reply_all_black_24dp
}
