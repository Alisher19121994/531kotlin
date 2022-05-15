package com.example.a531

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.main_rec_id)
        recyclerView.layoutManager = LinearLayoutManager(this)
        refreshAdapter(allData())
    }

    private fun refreshAdapter(chats: ArrayList<Chat>) {
        val adapter = Adapter_View(this, chats)
        recyclerView.adapter = adapter
    }

    private fun allData(): ArrayList<Chat> {
        val chat = ArrayList<Chat>()
        chat.add(Chat(R.drawable.alisher, "Alisher Daminov", "last seen recently", false))
        chat.add(Chat(R.drawable.alisher, "Alisher Daminov", "last seen recently", false))
        chat.add(Chat(R.drawable.alisher, "Alisher Daminov", "last seen recently", false))
        chat.add(Chat(R.drawable.alisher, "Alisher Daminov", "last seen recently", false))
        chat.add(Chat(R.drawable.alisher, "Alisher Daminov", "last seen recently", false))
        chat.add(Chat(R.drawable.alisher, "Alisher Daminov", "last seen recently", false))
        chat.add(Chat(R.drawable.alisher, "Alisher Daminov", "last seen recently", false))
        chat.add(Chat(R.drawable.alisher, "Alisher Daminov", "last seen recently", false))
        chat.add(Chat(R.drawable.alisher, "Alisher Daminov", "last seen recently", false))
        chat.add(Chat(R.drawable.alisher, "Alisher Daminov", "last seen recently", false))
        chat.add(Chat(R.drawable.alisher, "Alisher Daminov", "last seen recently", false))
        chat.add(Chat(R.drawable.alisher, "Alisher Daminov", "last seen recently", false))
        chat.add(Chat(R.drawable.alisher, "Alisher Daminov", "last seen recently", false))
        chat.add(Chat(R.drawable.alisher, "Alisher Daminov", "last seen recently", false))
        chat.add(Chat(R.drawable.alisher, "Alisher Daminov", "last seen recently", false))
        chat.add(Chat(R.drawable.alisher, "Alisher Daminov", "last seen recently", false))
        chat.add(Chat(R.drawable.alisher, "Alisher Daminov", "last seen recently", false))
        chat.add(Chat(R.drawable.alisher, "Alisher Daminov", "last seen recently", false))
        chat.add(Chat(R.drawable.alisher, "Alisher Daminov", "last seen recently", false))
        chat.add(Chat(R.drawable.alisher, "Alisher Daminov", "last seen recently", false))
        chat.add(Chat(R.drawable.alisher, "Alisher Daminov", "last seen recently", false))

        return chat
    }
}