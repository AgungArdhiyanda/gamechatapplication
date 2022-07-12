package com.example.gamechat


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.content.Intent


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<ImageButton>(R.id.addBtn)

        button.setOnClickListener{
            val intent = Intent(this,Mainpage::class.java)
            startActivity(intent)
            finish()
        }
    }
}
