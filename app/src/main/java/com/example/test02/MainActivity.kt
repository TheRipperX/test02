package com.example.test02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main()
    }

    private fun main() {
        Toast.makeText(this, "add git github", Toast.LENGTH_SHORT).show()
    }

    private fun lor() {
        Log.d("TAG", "lor: khar ha")
        //add log d in main activity
    }
}
