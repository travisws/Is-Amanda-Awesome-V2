package com.travis.amandaawesomev2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.CheckBox

class MainActivity : AppCompatActivity() {
    lateinit var box2: CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        box2 = findViewById(R.id.Box2)
        box2.setOnClickListener{
            val handler = Handler()
            handler.postDelayed(Runnable {
                box2.isChecked = false;
            }, 1500) //5 seconds

        }
    }
}