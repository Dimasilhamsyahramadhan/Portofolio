package com.example.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SkillActivity : AppCompatActivity() {

    lateinit var skillView: RecyclerView
    lateinit var SkillAdapter: SkillAdapter
    var list =ArrayList<skill_data>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        skillView = findViewById(R.id.skill)
        skillView.layoutManager = LinearLayoutManager(this)

        list.add(skill_data("kotlin","pemrograman android"))
        list.add(skill_data("kotlin","pemrograman android"))


        SkillAdapter = SkillAdapter(list)
        skillView.adapter = SkillAdapter
    }
}