package com.example.nativdroid1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_relative_vs_linear.*
import kotlinx.android.synthetic.main.relative_layout_activity.*

class RelativeVsLinearActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_vs_linear)


        val user = getIntent().getStringExtra("user")
        val pass = getIntent().getStringExtra("pass")

        etName.setText(user);
        etPass.setText(pass);
    }
}
