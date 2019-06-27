package com.abc.conslayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import android.widget.TextView
import java.time.LocalDate
import java.time.Period

class conslay : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conslay)

        val cal = findViewById<CalendarView>(R.id.cal)
        val txtage = findViewById<TextView>(R.id.txtage)


        cal.setOnDateChangeListener { view, year, month, dayOfMonth ->

            txtage.text = ageObj.calage(year, month, dayOfMonth).toString()
        }

    }


}
