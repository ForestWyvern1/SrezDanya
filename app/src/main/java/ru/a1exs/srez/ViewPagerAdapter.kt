package ru.a1exs.srez

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.a1exs.srez.databinding.ViewPagerBinding

class ViewPagerAdapter(private val context: Context, private val list: ArrayList<String>) : RecyclerView.Adapter<ViewPagerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
    LayoutInflater.from(context).inflate(R.layout.view_pager, parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val binding = ViewPagerBinding.bind(holder.itemView)

        binding.viewPagerText.text = list[position]
    }

    override fun getItemCount(): Int = list.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
}