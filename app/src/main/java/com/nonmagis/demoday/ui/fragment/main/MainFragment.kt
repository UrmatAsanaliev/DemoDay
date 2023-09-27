package com.nonmagis.demoday.ui.fragment.main

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.nonmagis.demoday.R
import com.nonmagis.demoday.data.model.RegisterModel
import com.nonmagis.demoday.databinding.ActivityMainBinding
import com.nonmagis.demoday.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private val binding: FragmentMainBinding by lazy {
        FragmentMainBinding.inflate(layoutInflater)
    }
    private val viewModel: MainViewModel by lazy {
        ViewModelProvider(requireActivity())[MainViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getUser()
    }

    private fun getUser() {
        binding.btnRegister.setOnClickListener {
            val username = binding.edUsername.text.toString()
            val password = binding.edPassword.text.toString()
            val password2 = binding.edPassword2.text.toString()
            viewModel.getUser(RegisterModel(username, password, password2))
            viewModel.liveData.observe(requireActivity()) {
                findNavController().navigate(R.id.resultFragment)
            }
        }
    }
}