package com.example.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class hobby : AppCompatActivity() {

    lateinit var hobbyView: RecyclerView
    lateinit var HobbyAdapter:HobbyAdapter
    var list =ArrayList<hobbydata>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobby)

        hobbyView = findViewById(R.id.rvhobby)
        hobbyView.layoutManager = LinearLayoutManager(this)

        list.add(hobbydata("kotlin","pemrograman android"))
        list.add(hobbydata("java","pemrograman web"))

        HobbyAdapter = HobbyAdapter(list)
        hobbyView.adapter = HobbyAdapter
    }
}