package com.aysebercin.catchthespongebob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Launcher : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)
    }

    fun nextActivity(view : View){

        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)


    }

}
