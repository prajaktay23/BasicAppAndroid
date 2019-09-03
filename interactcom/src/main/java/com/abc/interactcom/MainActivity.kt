package com.abc.interactcom

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dashactivity.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val int = Intent(//intent is a msg obj used to request another app
                this@MainActivity,
                Dashactivity::class.java//class class(skeleton of the class (bytecode))[type info]
            )
            val bnd = Bundle()//map[holds  key values]
            bnd.putString(KEY_NAME, edtNm.text.toString())

            int.putExtras(bnd)

            startActivity(int)
            finish()
        }
    }

    companion object {
        const val KEY_NAME = "my_name";
    }
}
