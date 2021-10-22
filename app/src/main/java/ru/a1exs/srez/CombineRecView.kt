package ru.a1exs.srez

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CombineRecView(context: Context, val list : ArrayList<RVModel>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object{
        val TYPE_ONE = 1
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun getItemViewType(position: Int): Int {
        return list[position].viewType
    }
}