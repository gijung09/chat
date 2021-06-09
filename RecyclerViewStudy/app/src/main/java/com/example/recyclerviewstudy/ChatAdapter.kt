package com.example.recyclerviewstudy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ChatAdapter: RecyclerView.Adapter<ChatAdapter.ItemViewHolder>() {
    private val chats = ArrayList<Chat>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatAdapter.ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_chat,parent,false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChatAdapter.ItemViewHolder, position: Int) {
        holder.bind(chats[position])
    }

    override fun getItemCount(): Int {
        return chats.size

    }
    fun addchats(chats: ArrayList<Chat>){
        this.chats.addAll(chats)
        notifyDataSetChanged()
    }

    inner class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view)
        fun bind(chat:Chat){
            itemView.item_tv_chat_name.text = chat.name
            itemView.item_tv_chat_message.text = chat.message

            itemView.apply{
                item_tv_chat_name.text = chat.name
                item_tv_chat_message.text = chat.message
            }
        }
}