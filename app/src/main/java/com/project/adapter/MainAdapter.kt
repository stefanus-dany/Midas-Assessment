package com.project.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.project.api.service.response.DataMenusResponse
import com.project.midas.databinding.ListItemBinding

class MainAdapter :
    RecyclerView.Adapter<MainAdapter.ViewHolder>() {
    private var data = ArrayList<DataMenusResponse>()

    fun setData(data: List<DataMenusResponse>?) {
        if (data == null) return
        this.data.clear()
        this.data.addAll(data)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val item =
            ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(item)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = data[position]
        holder.bind(data)
    }

    override fun getItemCount(): Int = data.size

    inner class ViewHolder(
        private val binding: ListItemBinding
    ) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(data: DataMenusResponse) {
            with(binding) {
                title.text = data.title
                ind.text = data.ind
                price.text = data.price.toString()
                discPrice.text = data.discPrice.toString()
            }
        }

    }
}