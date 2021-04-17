package com.path_studio.moviecatalogue.ui.tvShow

import android.os.Bundle
import androidx.fragment.app.Fragment
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

class TVShowFragment : BottomSheetDialogFragment(), OnBottomSheetCallbacks {

    private var currentState: Int = BottomSheetBehavior.STATE_HALF_EXPANDED
    private lateinit var textResult: AppCompatTextView
    private lateinit var filterImage: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as MainActivity).setOnBottomSheetCallbacks(this)

        val view = inflater.inflate(R.layout.fragment_t_v_show, container, false)

        //init
        textResult = view.findViewById(R.id.textResult2)
        filterImage = view.findViewById(R.id.filterImage2)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //default, show half layout
        (activity as MainActivity).closeBottomSheet()

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

}