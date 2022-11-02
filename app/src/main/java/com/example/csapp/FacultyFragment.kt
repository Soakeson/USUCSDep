package com.example.csapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.csapp.databinding.FragmentFacultyBinding

class FacultyFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentFacultyBinding.inflate(inflater, container, false)
        binding.facultyToHome.setOnClickListener {
            findNavController().navigate(R.id.factuly_to_home)
        }
        val faculty = listOf<FacultyMember>(
            FacultyMember("Mahdi Nasrullah Al-Ameen", "Assistant Professor", "Computer Science", "435-797-0241", "mahdi.al-ameen@usu.edu", "Old Main 401F"),
            FacultyMember("Vicki Allan", "Associate Professor", "Computer Science", "435-797-2022", "vicki.allan@usu.edu", "Old Main 426"),
            FacultyMember("Soukaina Filali Boubrahimi", "Assistant Professor", "Computer Science", "435-797-1020", "soukaina.boubrahimi@usu.edu", "Old Main 401A"),
            FacultyMember("Heng-Da Cheng", "Professor", "Computer Science", "435-797-2054", "hengda.cheng@usu.edu", "Old Main 401B"),
            FacultyMember("Isaac Cho", "Assistant Professor", "Computer Science", "435-797-1147", "isaac.cho@usu.edu", "Old Main 402G"),
            FacultyMember("Stephen Clyde", "Emeritus Associate Professor", "Computer Science", "435-797-2307", "stephen.clyde@usu.edu", "Old Main 418"),
            FacultyMember("Joseph Ditton", "Professional Practice Assistant Professor", "Computer Science", "435-797-1013", "joseph.ditton@usu.edu", "Old Main 420"),
            FacultyMember("Curtis Dyreson", "Professor", "Computer Science", "435-797-0742", "curtis.dyreson@usu.edu", "Old Main 402A"),
            FacultyMember("John Edwards", "Assistant Professor", "Computer Science", "435-797-0246", "john.edwards@usu.edu", "Old Main 401D"),
            FacultyMember("Erik Falor", "Professional Practice Associate Professor", "Computer Science", "435-797-4418", "erik.falor@usu.edu", "Old Main 418A"),
            FacultyMember("Nicholas Flann", "Computer Science", "Computer Science", "435-797-2432", "nick.flann@usu.edu", "Old Main 402C"),
            FacultyMember("Mario Harper", "Computer Science", "Computer Science", "435-797-0947", "mario.harper@usu.edu", "Old Maiun 401E"),
            FacultyMember("Hamid Karimi", "Assistant Professor", "Computer Science", "435-797-1233", "hamid.karimi@usu.edu", "Old Main 418"),
            FacultyMember("Rakesh Kaundal", "Assistant Professor", "Computer Science", "435-797-4117", "rkaundal@usu.edu", "CIB 101B"),
            FacultyMember("Vladimir Kulyukin", "Associate Professor", "Computer Science", "435-797-1000", "vladimir.kulyukin@usu.edu", "Old Main 402D"),
            FacultyMember("Chad Mano", "Professional Practice Associate Professor", "Computer Science", "435-797-5794", "chad.mano@usu.edu", "Old Main 435"),
            FacultyMember("Dean Mathias", "Professional Practice Associate Professor", "Computer Science", "435-797-4458", "dean.mathias@;usu.edu", "Old main 426"),
            FacultyMember("Shah Muhammad Hamdi", "Assistant Professor", "Computer Science", "", "s.hamdi@usu.edu", "Old main 437"),
            FacultyMember("Steve Petruzza", "Assistant Professor", "Computer Science", "435-797-1017", "steve.petruzza@usu.edu", "Old Main 424"),
            FacultyMember("Xiaojun Qi", "Department Head and Professor", "Computer Science", "435-797-8155", "xiaojun.qi@usu.edu", "Old Main 414A"),
            FacultyMember("Haito Wang", "Professor", "Computer Science", "435-797-2416", "haito.wang@usu.edu", "Old Main 402F"),
            FacultyMember("Dan Watson", "Associate Professor", "Computer Science", "435-797-2440", "dan.watson@usu.edu", "Old Main 402B"),
            FacultyMember("Shuhan Yuan", "Assistant Professor", "Computer Science", "435-797-0759", "shuhan.yuan@usu.edu", "Old Main 401C")


        )
        println(faculty)
        binding.recyclerView.adapter = FacultyAdapter(faculty)
        if (container != null) {
            binding.recyclerView.layoutManager = LinearLayoutManager(container.context)
        }
        return binding.root
    }

}