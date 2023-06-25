package com.aditya.projectakhir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val imgGalery : ImageView = findViewById(R.id.img_galery)
        val imgProfil : ImageView = findViewById(R.id.img_profil)
        val imgSosmed : ImageView = findViewById(R.id.img_sosmed)

        imgGalery.setOnClickListener {
            val intent = Intent (this@HomeActivity, MainActivity ::class.java)
            startActivity(intent)
        }
        imgProfil.setOnClickListener {
            val intent = Intent (this@HomeActivity, ActivityProfil ::class.java)
            startActivity(intent)
        }
        imgSosmed.setOnClickListener {
            val intent = Intent (this@HomeActivity, MedsosActivity ::class.java)
            startActivity(intent)
        }
    }
}