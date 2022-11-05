package com.example.csapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
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
        val projects = listOf<ResearchProject>(
            ResearchProject("Artifical Intelligence", "Multi-agent systems, physics informed deep learning, criticality in natural systems, automatic differentiation, deep neural networks, AI for social impact, robotics, decision science, precision apiculture, precision agriculture, assistive technology, PIV/PTV, and computability.", "Vicki Allan, Nick Flann, Hamid Karimi, Mario Harper, Vladimir Kulyukin"),
            ResearchProject("Algorithms", "Planning algorithms, optimization algorithms, simulation, and computational geometry", "John Edwards, Mario Harper, Haitao Wang"),
            ResearchProject("Augmented Virtual Reality", "3D user interfaces, human perception and cognition in VR and AR.", "Isaac Cho"),
            ResearchProject("Computer Science Education", "Educational data mining, keystroke analysis, and educational psychology.","John Edwards"),
            ResearchProject("Computer Vision", "Computer vision, pattern recognition, breast ultrasound (BUS) image processing, pavement crack detection/classification, uncertainty theories & new logics,  meta-learning, deep learning for medical Information processing, medical image segmentation, deep learning-based object detection & recognition, morphed face detection,  graph-based deep learning, and machine learning.", "Hengda Cheng, Xiaojun Qi"),
            ResearchProject("Cybersecurity", "Human aspects of security, and privacy perceptions of users.", "Mahidi Nashrullah Al-Ameen"),
            ResearchProject("Data Science and Data Mining", "Applied data mining for space weather research and pattern discovery from large time series data, social network analysis, graph mining, social media mining, educational data mining, machine learning, deep learning, representation learning of graphs and multivariate time series, ML cyberinfrastructure development, deep learning and its applications in anomaly detection, and natural language processing.", "Soukaina Filali Boubrahimi, Hamid Karimi, Shah Muhammad Hamdi, Shuhan Yuan"),
            ResearchProject("Data Visualization and Visual Analytics", "Decision-making and sence making, user behavior analytics, text analytics, and data analytics.", "Isaac Cho"),
            ResearchProject("Database Systems", "Temporal databases, hierachical databases, biodiversity databases.", "Curtis Dyreson"),
            ResearchProject("High Performance Computing and Scientific Visualization", "Big data analysis and visualization, distributed and parallel computing, topological analysis, cyberinfrastructure, cloud computing, and simulation visualization.", "John Edwards, Steve Petruzza"),
            ResearchProject("Information and Communication Technology for Development (ICT4D", "Usability issues and privacy concerns around digital technology use in developing countries.", "Mahidi Nashrullah Al-Ameen"),
            ResearchProject("Human Computer Interaction", "User behavior and challenges in technology use and corresponding workarounds, virtual reality, augmented reality, and 3D user interfaces.", "Mahdi Nasrullah Al-Ameen, Isaac Cho")
        )
        binding.recyclerView.adapter = ResearchAdapter(projects)
        if (container != null) {
            binding.recyclerView.layoutManager = LinearLayoutManager(container.context)
        }
        return binding.root
    }

}