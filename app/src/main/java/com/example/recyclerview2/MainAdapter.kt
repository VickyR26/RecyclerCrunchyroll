package com.example.recyclerview2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview2.databinding.CrunchCardBinding
import org.json.JSONObject

class MainAdapter(private val anime: Array<JSONObject>): RecyclerView.Adapter<MainAdapter.MainHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.MainHolder {
        val binding = CrunchCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MainHolder(binding)
    }

    override fun onBindViewHolder(holder: MainAdapter.MainHolder, position: Int) {
        holder.render(anime[position])
    }

    override fun getItemCount(): Int = anime.size

    class MainHolder(val binding: CrunchCardBinding): RecyclerView.ViewHolder(binding.root) {
        fun render(video: JSONObject) {
            binding.TextTitulo.setText(video.getString("titulo"))
            binding.TextTipo.setText(video.getString("tipo"))
            binding.TextDoblaje.setText(video.getString("doblaje"))
            binding.TextEstado.setText(video.getString("estado"))
            binding.ImagePortada.setImageResource(R.drawable.video)
        }
    }
}