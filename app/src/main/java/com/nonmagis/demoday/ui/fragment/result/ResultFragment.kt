package com.nonmagis.demoday.ui.fragment.result

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nonmagis.demoday.R
import com.nonmagis.demoday.databinding.FragmentResultBinding

class ResultFragment : Fragment() {

    private val binding: FragmentResultBinding by lazy {
        FragmentResultBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

}