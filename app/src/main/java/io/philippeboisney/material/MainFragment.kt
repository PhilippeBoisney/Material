package io.philippeboisney.material

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.util.Pair
import androidx.fragment.app.Fragment
import androidx.navigation.ActivityNavigatorExtras
import androidx.navigation.fragment.findNavController
import io.philippeboisney.material.animation.makeSceneTransitionAnimation
import io.philippeboisney.material.databinding.FragmentMainBinding
import io.philippeboisney.material.model.Mail
import io.philippeboisney.material.views.MailAdapter

/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment(), MailAdapter.Listener {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentMainBinding.inflate(inflater, container, false)
        binding.fragmentMainRv.adapter = MailAdapter(this)
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    // ---

    override fun onClick(mail: Mail, rootView: View, imageView: View) {
        val options = makeSceneTransitionAnimation(
            requireActivity(),
            Pair(rootView, getString(R.string.transition_root)),
            Pair(imageView, getString(R.string.transition_image)),
            Pair(requireActivity().findViewById(R.id.fab), getString(R.string.transition_fab)),
            Pair(requireActivity().findViewById(R.id.bar), getString(R.string.transition_bar)))
        val extras = ActivityNavigatorExtras(options)
        findNavController().navigate(MainFragmentDirections.actionMainFragmentToDetailActivity(mail.id), extras)
    }
}
