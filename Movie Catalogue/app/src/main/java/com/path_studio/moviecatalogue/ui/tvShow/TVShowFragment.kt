package com.path_studio.moviecatalogue.ui.tvShow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.path_studio.moviecatalogue.R
import com.path_studio.moviecatalogue.databinding.FragmentTvShowBinding
import com.path_studio.moviecatalogue.ui.bottomSheet.OnBottomSheetCallbacks
import com.path_studio.moviecatalogue.ui.mainPage.MainActivity

class TVShowFragment : BottomSheetDialogFragment(), OnBottomSheetCallbacks {

    private var _binding: FragmentTvShowBinding? = null
    private val binding get() = _binding as FragmentTvShowBinding

    private var currentState: Int = BottomSheetBehavior.STATE_HALF_EXPANDED
    private lateinit var textResult: AppCompatTextView
    private lateinit var filterImage: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //set binding
        _binding = FragmentTvShowBinding.inflate(inflater, container, false)
        val view = binding.root

        //set loading
        showLoading(true)

        //init
        textResult = view.findViewById(R.id.textResult2)
        filterImage = view.findViewById(R.id.indicatorImage2)

        //set loading
        showLoading(true)

        //set bottomSheet Callbacks
        (activity as MainActivity).setOnBottomSheetCallbacks(this)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //default, show half layout
        (activity as MainActivity).closeBottomSheet()

        if (activity != null) {
            val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[TvShowViewModel::class.java]
            val shows = viewModel.getTvShow()

            val tvShowAdapter = TvShowAdapter()
            tvShowAdapter.setTvShow(shows)

            with(binding.rvTvShow) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = tvShowAdapter
                showLoading(false)
            }
        }

        textResult.setOnClickListener {
            (activity as MainActivity).openBottomSheet()
        }

        filterImage.setOnClickListener {
            if (currentState == BottomSheetBehavior.STATE_EXPANDED) {
                (activity as MainActivity).closeBottomSheet()
            } else if (currentState == BottomSheetBehavior.STATE_HALF_EXPANDED){
                (activity as MainActivity).openBottomSheet()
            }
        }
    }

    override fun onStateChanged(bottomSheet: View, newState: Int) {
        currentState = newState
        when (newState) {
            BottomSheetBehavior.STATE_EXPANDED -> {
                textResult.text = this.getString(R.string.results)
                filterImage.setImageResource(R.drawable.ic_baseline_expand_more_purple)
            }
            BottomSheetBehavior.STATE_HALF_EXPANDED -> {
                textResult.text = this.getString(R.string.list_of_tv_shows)
                filterImage.setImageResource(R.drawable.ic_baseline_expand_less_purple)
            }
        }
    }

    private fun showLoading(state: Boolean) {
        if (state) {
            binding.progressBar.visibility = View.VISIBLE
        } else {
            binding.progressBar.visibility = View.GONE
        }
    }

}