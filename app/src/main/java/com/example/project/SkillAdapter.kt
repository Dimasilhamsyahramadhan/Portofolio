package com.example.project

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class SkillAdapter (private val list:ArrayList<skill_data>):
    RecyclerView.Adapter<SkillAdapter.SkillViewHolder>(){
        class SkillViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
private val nama = itemView.findViewById<TextView>(R.id.namaskill)
private val desc = itemView.findViewById<TextView>(R.id.descskill)

fun bind(get: skill_data) {
    nama.text = get.nama
    desc.text = get.desc
}
}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SkillViewHolder {
        return SkillAdapter.SkillViewHolder(LayoutInflater.from(parent.context)
                    .inflate(R.layout.skill_list, parent, false))

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: SkillViewHolder, position: Int) {
        holder.bind(list[position])

    }
}