package com.abc.recycler_view

import android.content.Context
import android.service.autofill.Dataset
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class Myadapter(
    private val context: Context,
    private val dataset: ArrayList<MyData>
) : RecyclerView.Adapter<Myadapter.MyViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): MyViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.my_item, viewGroup, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int = dataset.size//inline function

    override fun onBindViewHolder(vh: MyViewHolder, pos: Int) {

        vh.text().text = dataset.get(pos).toString()
        vh.img().setImageResource(dataset[pos].img)

    }


    class MyViewHolder(
        private val view: View
    ) : RecyclerView.ViewHolder(view) {

        fun text() = view.findViewById<TextView>(R.id.txtVw)
        fun img() = view.findViewById<ImageView>(R.id.imgVw)
    }

}