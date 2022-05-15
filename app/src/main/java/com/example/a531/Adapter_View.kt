package com.example.a531

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class Adapter_View(var context: Context, val lists: ArrayList<Chat>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val HEADER = 0
    private val YES = 1

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == HEADER) {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.header, parent, false)
            return MyViews(view)
        }
        val view1 = LayoutInflater.from(parent.context).inflate(R.layout.adapter, parent, false)
        return MyViews2(view1)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val chat = lists[position]
        if (holder is MyViews2){
           holder.image.setImageResource(chat.profile)
           holder.text1.text = chat.fullname
           holder.text2.text = chat.seen
        }
    }

    override fun getItemCount(): Int {
        return lists.size
    }

    override fun getItemViewType(position: Int): Int {
        if (isHeader(position)) return HEADER
        val list = lists[position]
        return if (list.available) YES else YES
    }

    fun isHeader(position: Int): Boolean {
        return position == 0
    }

    inner class MyViews(item: View) : RecyclerView.ViewHolder(item) {

    }
    inner class MyViews2(item: View) : RecyclerView.ViewHolder(item) {
        val image: ShapeableImageView = item.findViewById(R.id.image_v)
        val text1: TextView = item.findViewById(R.id.fullname)
        val text2: TextView = item.findViewById(R.id.seen)
    }
}