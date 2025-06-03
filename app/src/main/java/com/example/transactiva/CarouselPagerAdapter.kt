package com.example.transactiva

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CarouselPagerAdapter(private val layouts: List<Int>) : RecyclerView.Adapter<CarouselPagerAdapter.PagerViewHolder>() {

    class PagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // Aquí puedes inicializar vistas dentro de tus layouts si es necesario
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(layouts[viewType], parent, false)
        return PagerViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PagerViewHolder, position: Int) {
        // No necesitamos hacer nada específico aquí ya que los layouts ya están definidos
    }

    override fun getItemCount(): Int {
        return layouts.size
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }
}