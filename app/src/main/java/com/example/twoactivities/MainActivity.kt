package com.example.twoactivities

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.core.content.PackageManagerCompat.LOG_TAG

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @SuppressLint("RestrictedApi")
    fun launchSecondActivity(view: View) {

        Log.d(LOG_TAG, "Button clicked!")
        val intent= Intent(this, SecondActivity::class.java)



        var getName= findViewById<EditText>(R.id.nameText)

        val text= getName.text.toString()

        Log.d(LOG_TAG, text)

        intent.putExtra("name", text )

        startActivity(intent)



    }
}