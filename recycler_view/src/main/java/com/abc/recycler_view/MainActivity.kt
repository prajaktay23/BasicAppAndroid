package com.abc.recycler_view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()

    }

    private fun initRecyclerView() {
        val et = findViewById<EditText>(R.id.editText)

        val myadapter = Myadapter(
            this,
            recyclerData()
        ) { pos, dataM ->
            et.setText(dataM.text)
        }
        val viewManager = LinearLayoutManager(this)
        val recVw = findViewById<RecyclerView>(R.id.recVw)
        recVw.apply {

            setHasFixedSize(true)

            layoutManager = viewManager

            adapter = myadapter

        }

    }


    private fun recyclerData(): ArrayList<MyData> {
        val dataset = ArrayList<MyData>()
        dataset.add(
            MyData(
                R.mipmap.ic_launcher,
                "Andriod"
            )
        )
        dataset.add(
            MyData(
                R.mipmap.ic_launcher,
                "Apple"

            )
        )
        dataset.add(
            MyData(
                R.mipmap.ic_launcher,
                "Samsung"
            )
        )
        dataset.add(
            MyData(
                R.mipmap.ic_launcher,
                "Rim"
            )
        )
        dataset.add(
            MyData(
                R.mipmap.ic_launcher,
                "Vivo"
            )
        )
        dataset.add(
            MyData(
                R.mipmap.ic_launcher,
                "Oppo"
            )
        )
        dataset.add(
            MyData(
                R.mipmap.ic_launcher,
                "Mi"
            )
        )
        return dataset
    }
}