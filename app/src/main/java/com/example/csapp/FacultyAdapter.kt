package com.example.csapp

import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import com.example.csapp.databinding.FacultyListItemBinding

class FacultyAdapter(val faculty: List<FacultyMember>) : RecyclerView.Adapter<FacultyAdapter.ViewHolder>() {
    class ViewHolder(val binding: FacultyListItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun getItemCount(): Int {
        return faculty.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = FacultyListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val facultyMem = faculty[position]
        holder.binding.nameTextView.text = facultyMem.name
        holder.binding.departmentTextView.text = facultyMem.department
        holder.binding.phoneTextView.text = "Phone: " + facultyMem.phone
        holder.binding.emailTextView.text = "Email: " + facultyMem.email
        holder.binding.officeTextView.text = "Office: " + facultyMem.office
        holder.binding.titleTextView.text = facultyMem.title
    }
}