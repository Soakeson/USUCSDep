
package com.example.csapp

import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import com.example.csapp.databinding.ResearchListItemBinding

class ResearchAdapter(val projects: List<ResearchProject>) : RecyclerView.Adapter<ResearchAdapter.ViewHolder>() {
    class ViewHolder(val binding: ResearchListItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun getItemCount(): Int {
        return projects.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ResearchListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val project = projects[position]
        holder.binding.researchNameTextView.text = project.name
        holder.binding.researchDescriptionTextView.text = project.description
        holder.binding.researchMembersTextView.text = project.members
    }
}