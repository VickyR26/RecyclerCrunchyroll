package com.example.recyclerview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.json.JSONObject
import com.example.recyclerview2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fakeAnimeData: Array<JSONObject> = arrayOf(
            JSONObject("{\"titulo\": \"Demon Slayer: Kimetsu no Yaiba\", \"tipo\": \"SERIE\", \"doblaje\": \"DOBLAJES\", \"estado\": \"Finalizado\"}"),
            JSONObject("{\"titulo\": \"Attack on Titan\", \"tipo\": \"SERIE\", \"doblaje\": \"SIN DOBLAJES\", \"estado\": \"En transmision\"}"),
            JSONObject("{\"titulo\": \"One Piece\", \"tipo\": \"PELICULA\", \"doblaje\": \"DOBLAJES\", \"estado\": \"En transmision\"}"),
            JSONObject("{\"titulo\": \"Ranking of Kings\", \"tipo\": \"SERIE\", \"doblaje\": \"DOBLAJES\", \"estado\": \"Finalizado\"}"),
            JSONObject("{\"titulo\": \"In the Land of Leadale\", \"tipo\": \"SERIE\", \"doblaje\": \"SIN DOBLAJES\", \"estado\": \"Finalizado\"}"),)

        binding.rvAnimeEntries.adapter = MainAdapter(fakeAnimeData)
    }
}