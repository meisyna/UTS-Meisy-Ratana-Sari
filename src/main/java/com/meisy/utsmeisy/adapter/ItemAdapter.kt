package com.meisy.utsmeisy.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.meisy.utsmeisy.R
import com.meisy.utsmeisy.model.UTSMeisy

//Menambahkan Parameter kedalam konstruktor
class ItemAdapter(
    private val context: Context,
    private val dataset: List<UTSMeisy>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    //membuat viewholder untuk memperbarui tampilan item daftar dengan data baru
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // membuat view baru
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    //Membuat onBindViewHolder untuk mengganti isi tampilan item daftar
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    //Mengembalikan ukuran data
    override fun getItemCount() = dataset.size
}