package io.philippeboisney.material


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import io.philippeboisney.material.databinding.FragmentDetailBinding
import io.philippeboisney.material.model.utils.DataGenerator
import io.philippeboisney.material.views.SpannedGridLayoutManager

/**
 * A simple [Fragment] subclass.
 *
 */
class DetailFragment : Fragment() {

    private val args: DetailFragmentArgs by navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentDetailBinding.inflate(inflater, container, false)
        binding.activityDetailRv.layoutManager = SpannedGridLayoutManager(3,1f)
        binding.mail = DataGenerator.findMailById(args.id)
        binding.lifecycleOwner = this
        return binding.root
    }
}
