package com.example.nativdroid1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_relative_vs_linear.*

class RelativeVsLinearActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_vs_linear)

        var user = intent.getStringExtra("user")
        var pass = intent.getStringExtra("pass")

        etName.setText(user)
        etPass.setText(pass)

    }

    override fun onBackPressed() {

        setResult(457889,Intent().apply {
            putExtra("result", "Resultado de la actividad 2")
        })
        super.onBackPressed()
    }

}
