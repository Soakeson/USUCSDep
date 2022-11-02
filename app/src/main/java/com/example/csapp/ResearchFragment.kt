package com.example.csapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.csapp.databinding.FragmentResearchBinding

class ResearchFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentResearchBinding.inflate(inflater, container, false)
        binding.researchToHome.setOnClickListener {
            findNavController().navigate(R.id.research_to_home)
        }
        return binding.root
    }

}