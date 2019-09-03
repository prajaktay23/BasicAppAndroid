package com.abc.recycler_view

import android.content.Context
import android.service.autofill.Dataset
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class Myadapter(
    private val context: Context,
    private val dataset: ArrayList<MyData>,
    private val onItemClick: (pos: Int, daya: MyData) -> Unit
) : RecyclerView.Adapter<Myadapter.MyViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): MyViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.my_item, viewGroup, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int = dataset.size//inline function

    override fun onBindViewHolder(vh: MyViewHolder, pos: Int) {

        vh.rootView().setOnClickListener {
            Log.i("@codekul", "item clicked at $pos")
            onItemClick(pos, dataset[pos])
        }

        vh.text().text = dataset.get(pos).text

        vh.img().setImageResource(dataset[pos].img)

    }


    class MyViewHolder(
        private val view: View
    ) : RecyclerView.ViewHolder(view) {

        fun text() = view.findViewById<TextView>(R.id.txtVw)
        fun img() = view.findViewById<ImageView>(R.id.imgVw)
        fun rootView() = view
    }

}