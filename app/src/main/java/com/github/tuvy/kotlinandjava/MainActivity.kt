package com.github.tuvy.kotlinandjava

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        せっとあっぷつーるばー()
        setupNext()
    }

    private fun せっとあっぷつーるばー() {
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        title = getString(R.string.title_activity_main)
    }

    private fun setupNext() {
        val button = findViewById<Button>(R.id.next)
        button.setOnClickListener {
            startActivity(Intent(this, SubActivity::class.java))
        }
    }
}
