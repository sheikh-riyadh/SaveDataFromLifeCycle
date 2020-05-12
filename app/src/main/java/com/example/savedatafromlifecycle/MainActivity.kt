package com.example.savedatafromlifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var count = 0
    var TAG : String = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i(TAG,"onCreate called")

        var button = findViewById<Button>(R.id.btn_Id)
        var txt = findViewById<TextView>(R.id.txt_Id)

        button.setOnClickListener {
           txt.text = count++.toString()
        }
        // we get the value from key
        if (savedInstanceState!=null){
            count = savedInstanceState.getInt("Count_value")
        }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
    }
    // we put the value by key value pair
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("Count_value",count)
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG ,"onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG ,"onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG ,"onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG ,"onStop called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG ,"onRestart called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG ,"onDestroy called")
    }
}
