package com.example.nativdroid1

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.relative_layout_activity.*

class MyFirstActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.relative_layout_activity)

        buttonLogin.setOnClickListener{
            var myIntent = Intent(this, RelativeVsLinearActivity::class.java)

            myIntent.putExtra("user", editTextUser.text.toString())
            myIntent.putExtra("pass", editTextPass.text.toString())

            this.startActivityForResult(myIntent,12)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 12 && resultCode == 457889){
            var result = data?.getStringExtra("result")
            Toast.makeText(this, "$result",Toast.LENGTH_LONG).show()
        }
    }

    override fun onStart() {
        Toast.makeText(this, "onStart",Toast.LENGTH_LONG).show()
        super.onStart()
    }

    override fun onResume() {
        Toast.makeText(this, "onResume",Toast.LENGTH_LONG).show()
        super.onResume()
    }

    override fun onStop() {
        Toast.makeText(this, "onStop",Toast.LENGTH_LONG).show()
        super.onStop()
    }

    override fun onDestroy() {
        Toast.makeText(this, "onDestroy",Toast.LENGTH_LONG).show()
        super.onDestroy()
    }
}