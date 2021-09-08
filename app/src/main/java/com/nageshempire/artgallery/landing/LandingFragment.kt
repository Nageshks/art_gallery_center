package com.nageshempire.artgallery.landing

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.nageshempire.artgallery.R
import com.nageshempire.artgallery.databinding.FragmentLandingBinding
import com.nageshempire.artgallery.landingFeature
import com.nageshempire.artgallery.landingFooter
import com.nageshempire.artgallery.landingHead
import com.nageshempire.artgallery.model.LandingFeature


class LandingFragment : Fragment() {

    private var _binding: FragmentLandingBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentLandingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupList()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun navigateToProfile() {
        findNavController().navigate(R.id.action_LandingFragment_to_ProfileFragment)
    }

    // Todo : Observe livedata on production
    private fun setupList() {
        binding.list.setItemSpacingDp(16)
        binding.list.withModels {
            landingHead {
                id("LandingHead")
                registerClickListener { _ ->
                    navigateToProfile()
                }
            }

            getSamplesFeatures().forEach { feature ->
                landingFeature {
                    id(feature.imageResource)
                    feature(feature)
                }
            }

            landingFooter {
                id("LandingFooter")
            }
        }
    }

    // Todo : Move this to repository on production
    private fun getSamplesFeatures() = listOf(
        LandingFeature(
            getString(R.string.lorem_title),
            getString(R.string.lorem_para),
            R.drawable.vector_drawable_landing_direction
        ),
        LandingFeature(
            getString(R.string.lorem_title),
            getString(R.string.lorem_para),
            R.drawable.vector_drawable_landing_phone
        ),
        LandingFeature(
            getString(R.string.lorem_title),
            getString(R.string.lorem_para),
            R.drawable.vector_drawable_landing_atom
        ),
        LandingFeature(
            getString(R.string.lorem_title),
            getString(R.string.lorem_para),
            R.drawable.vector_drawable_landing_network
        ),
        LandingFeature(
            getString(R.string.lorem_title),
            getString(R.string.lorem_para),
            R.drawable.vector_drawable_landing_star
        ),
        LandingFeature(
            getString(R.string.lorem_title),
            getString(R.string.lorem_para),
            R.drawable.vector_drawable_landing_book
        ), LandingFeature(
            getString(R.string.lorem_title),
            getString(R.string.lorem_para),
            R.drawable.vector_drawable_landing_flag
        ),
        LandingFeature(
            getString(R.string.lorem_title),
            getString(R.string.lorem_para),
            R.drawable.vector_drawable_landing_mouse
        )
    )
}