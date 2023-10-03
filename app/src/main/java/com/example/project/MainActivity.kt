package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnProfile: CardView = findViewById(R.id.profile)
        val btnPortofolio: CardView = findViewById(R.id.portofolio)
        val btnSkill: CardView = findViewById(R.id.skill)
        val btneducation: CardView = findViewById(R.id.education)


        btnProfile.setOnClickListener {
            val Intent = Intent(this, profile::class.java)
            startActivity(Intent)

        }
        btnPortofolio.setOnClickListener {
            val Intent = Intent(this, portofolio::class.java)
            startActivity(Intent)
        }
        btnSkill.setOnClickListener {
            val Intent = Intent(this, skill::class.java)
            startActivity(Intent)

        }
        btneducation.setOnClickListener {
            val Intent = Intent(this, hobby::class.java)
            startActivity(Intent)
        }
    }
}
