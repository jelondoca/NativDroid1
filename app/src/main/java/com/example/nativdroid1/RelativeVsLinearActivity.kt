package com.example.nativdroid1

import android.content.DialogInterface.*
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_relative_vs_linear.*
import kotlinx.android.synthetic.main.relative_layout_activity.*

class RelativeVsLinearActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_vs_linear)

        var user = getStringFromIntent("user")
        var pass = getStringFromIntent("pass")
        etName.setText(user)
        etPass.setText(pass)

    }

    private fun getStringFromIntent(intentKey: String): String {
        if (intent.hasExtra(intentKey)) {
            var extra: Bundle? = intent.extras
            var text = extra?.get(intentKey)
            if (text != null) {
                return text.toString()
            }
        }
        return ""

    }

}
