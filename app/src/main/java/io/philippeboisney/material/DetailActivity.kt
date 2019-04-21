package io.philippeboisney.material

import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.core.app.ActivityCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.navArgs
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import io.philippeboisney.material.base.BaseActivity
import io.philippeboisney.material.databinding.ActivityDetailBinding
import io.philippeboisney.material.model.utils.DataGenerator
import io.philippeboisney.material.views.SpannedGridLayoutManager



/**
 * A simple [Fragment] subclass.
 */
class DetailActivity : BaseActivity() {

    private val args: DetailActivityArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityDetailBinding>(this, R.layout.activity_detail)
        binding.activityDetailRv.layoutManager = SpannedGridLayoutManager(3,1f)
        binding.mail = DataGenerator.findMailById(args.id)
        binding.lifecycleOwner = this
    }

    override fun getMenu(): Int
        = R.menu.bottomappbar_menu_detail

    override fun getFabIcon(): Int
        = R.drawable.ic_reply_all_black_24dp

    // ---

    fun onClickBackButton(view: View) {
        ActivityCompat.finishAfterTransition(this)
    }
}
