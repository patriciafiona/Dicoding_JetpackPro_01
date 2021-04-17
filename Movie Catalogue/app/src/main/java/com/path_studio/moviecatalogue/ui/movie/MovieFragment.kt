package com.path_studio.moviecatalogue.ui.movie

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
import com.path_studio.moviecatalogue.databinding.FragmentMovieBinding
import com.path_studio.moviecatalogue.ui.MainActivity
import com.path_studio.moviecatalogue.ui.bottomSheet.OnBottomSheetCallbacks

class MovieFragment : BottomSheetDialogFragment(), OnBottomSheetCallbacks {

    private var _binding: FragmentMovieBinding? = null
    private val binding get() = _binding as FragmentMovieBinding
    private var currentState: Int = BottomSheetBehavior.STATE_HALF_EXPANDED

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //set binding
        _binding = FragmentMovieBinding.inflate(inflater, container, false)
        val view = binding.root

        //set bottomSheet Callbacks
        (activity as MainActivity).setOnBottomSheetCallbacks(this)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //default, show half layout
        (activity as MainActivity).closeBottomSheet()

        if (activity != null) {
            val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[MovieViewModel::class.java]
            val movies = viewModel.getMovies()

            val movieAdapter = MovieAdapter()
            movieAdapter.setMovies(movies)

            with(binding.rvMovie) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = movieAdapter
            }
        }

        binding.textResult.setOnClickListener {
            (activity as MainActivity).openBottomSheet()
        }

        binding.indicatorImage.setOnClickListener {
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
                binding.textResult.text = this.getString(R.string.results)
                binding.indicatorImage.setImageResource(R.drawable.ic_baseline_expand_more_purple)
            }
            BottomSheetBehavior.STATE_HALF_EXPANDED -> {
                binding.textResult.text = this.getString(R.string.list_of_movies)
                binding.indicatorImage.setImageResource(R.drawable.ic_baseline_expand_less_purple)
            }
        }
    }

}