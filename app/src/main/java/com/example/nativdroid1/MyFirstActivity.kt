package com.example.nativdroid1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.relative_layout_activity.*

class MyFirstActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.relative_layout_activity)

        buttonLogin.setOnClickListener{
            var myIntent = Intent(this, RelativeVsLinearActivity::class.java)
            myIntent.putExtra("user",editTextUser.text)
            myIntent.putExtra("pass",editTextPass.text)
            startActivity(myIntent)
        }
    }
}