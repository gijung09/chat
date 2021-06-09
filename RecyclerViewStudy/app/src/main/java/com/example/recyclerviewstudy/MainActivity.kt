package com.example.recyclerviewstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val chatadapter = ChatAdapter()
    private val chats =ArrayList<Chat>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chats.add(Chat("리븐", "안녕"))
        chats.add(Chat("리븐", "반가워"))
        chats.add(Chat("다리우스", "ㅎ2ㅎ2"))
        chats.add(Chat("다리우스", "방가방가"))

        rv_main_chat.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = chatadapter
        }


    }
}