package com.path_studio.moviecatalogue.ui.movie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatTextView
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.path_studio.moviecatalogue.R
import com.path_studio.moviecatalogue.ui.MainActivity
import com.path_studio.moviecatalogue.ui.bottomSheet.OnBottomSheetCallbacks

class MovieFragment : BottomSheetDialogFragment(), OnBottomSheetCallbacks {

    private var currentState: Int = BottomSheetBehavior.STATE_EXPANDED
    private lateinit var textResult: AppCompatTextView
    private lateinit var filterImage: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as MainActivity).setOnBottomSheetCallbacks(this)

        val view = inflater.inflate(R.layout.fragment_movie, container, false)

        //init
        textResult = view.findViewById(R.id.textResult)
        filterImage = view.findViewById(R.id.filterImage)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textResult.setOnClickListener {
            (activity as MainActivity).openBottomSheet()
        }

        filterImage.setOnClickListener {
            if (currentState == BottomSheetBehavior.STATE_EXPANDED) {
                (activity as MainActivity).closeBottomSheet()
            } else  {
                (activity as MainActivity).openBottomSheet()
            }
        }
    }

    override fun onStateChanged(bottomSheet: View, newState: Int) {
        currentState = newState
        when (newState) {
            BottomSheetBehavior.STATE_EXPANDED -> {
                textResult.text = "0 results"
                filterImage.setImageResource(R.drawable.ic_baseline_expand_more_purple)
            }
            BottomSheetBehavior.STATE_HALF_EXPANDED -> {
                textResult.text = "See the results"
                filterImage.setImageResource(R.drawable.ic_baseline_expand_less_purple)
            }
        }
    }

}