package com.example.gamechat


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.content.Intent
import android.view.Window


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_main)

        val button = findViewById<ImageButton>(R.id.addBtn)

        button.setOnClickListener{

            //AnimasiTombol
            button.animate().apply{
                duration = 1000
                rotationX(360f)

            }//GantiActivity
            val intent = Intent(this,Mainpage::class.java)
            startActivity(intent)
            finish()
        }



    }
}
