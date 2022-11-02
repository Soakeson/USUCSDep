package com.example.csapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.csapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.toFaculty.setOnClickListener {
            findNavController().navigate(R.id.home_to_falculty)
        }
        binding.toResearch.setOnClickListener {
            findNavController().navigate(R.id.home_to_research)
        }
        return binding.root
    }
}