package com.example.projectuaskelompok4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projectuaskelompok4.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {

    private lateinit var  binding: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnLogout.setOnClickListener {
            logout()
        }

        //Explicit intent
        binding.btnMove.setOnClickListener {
            val i = Intent(this, FavoriteActivity::class.java)
            startActivity(i)
        }

        binding.btnBiodata.setOnClickListener {

            val i = Intent(this, BiodataActivity::class.java)
            startActivity(i)
        }

        binding.btnProduct.setOnClickListener {

            val i = Intent(this, ProductActivity::class.java)
            startActivity(i)

        }
    }

    private fun logout() {
        // Hapus token atau status login dari Shared Preferences
        val sharedPref = getSharedPreferences("MyApp", MODE_PRIVATE)
        with (sharedPref.edit()) {
            clear()
            apply()
        }

        // Arahkan pengguna ke MainActivity
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
        finish() // Selesaikan MenuActivity
    }
}