package com.example.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class EducationActivity : AppCompatActivity() {

    lateinit var educationviews: RecyclerView
    lateinit var educationadapter: SchoolAdapter
    val list = ArrayList<SchoolData>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_education)

        educationviews = findViewById(R.id.rvEducation)
        educationviews.layoutManager = LinearLayoutManager( this)

        list.add(SchoolData("SDN ISLAM SITI SULAECHAH", "Sriwulan"))
        list.add(SchoolData("SMP NEGERI 1 SAYUNG", "Sayung"))
        list.add(SchoolData("SMK NEGERI 1 SAYUNG", "Onggorawe"))

        educationadapter = SchoolAdapter(list)
        educationviews.adapter = educationadapter
    }
}