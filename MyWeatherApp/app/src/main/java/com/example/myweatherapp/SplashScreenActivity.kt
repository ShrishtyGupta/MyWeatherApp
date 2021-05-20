package com.example.myweatherapp

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView


class SplashScreenActivity : AppCompatActivity() {


    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val ta=AnimationUtils.loadAnimation(this, R.anim.top_animation)
        val ba1=AnimationUtils.loadAnimation(this, R.anim.bottom_animation)
        val ba2 =AnimationUtils.loadAnimation(this, R.anim.bottom_animation)
        val al = findViewById<ImageView>(R.id.topImageView)
        val bt = findViewById<TextView>(R.id.bottomText)
        val bt1 = findViewById<TextView>(R.id.bottomTextView)

        al.startAnimation(ta)
        bt.startAnimation(ba1)
        bt1.startAnimation(ba2)






        handler=Handler()
        handler.postDelayed({

            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        },2000)




    }
}