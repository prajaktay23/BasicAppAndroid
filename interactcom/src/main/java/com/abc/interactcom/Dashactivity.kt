package com.abc.interactcom

import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import kotlinx.android.synthetic.main.activity_dashactivity.*

class Dashactivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashactivity)

        val mnm = intent.extras?.getString("my_name")

        txtrs.setText(mnm)

        btrs.setOnClickListener {

        }
    }

    fun doProcessing() = txtrs.text.toString().toUpperCase()
}
