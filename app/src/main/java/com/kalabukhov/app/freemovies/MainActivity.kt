package com.kalabukhov.app.freemovies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kalabukhov.app.freemovies.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        actBtn()
        actCreateTextWindow()
        actCreateCycle()
    }

    private fun actCreateCycle() {
        val arr = arrayOf("Макс", "Петр", "Евгений")
        for (arrTest in arr) {
            Thread.sleep(200)
            Toast.makeText(applicationContext, arrTest, Toast.LENGTH_SHORT).show()
        }

        for (i in 1..5) {
            Toast.makeText(applicationContext, i.toString(), Toast.LENGTH_SHORT).show()
        }

        for(i in 10 downTo 1 step 2) {
            Toast.makeText(applicationContext, i.toString(), Toast.LENGTH_SHORT).show()
        }
    }

    private fun actCreateTextWindow() {
        val nameAndStarsMovies = Movies("Super Man", 8)
        binding.textName.text = nameAndStarsMovies.nameMovies
        binding.textStars.text = nameAndStarsMovies.stars.toString()

        val copyObj = nameAndStarsMovies.copy(nameMovies = Settings.falseName, stars = Settings.falseStars)
        binding.textName2.text = copyObj.nameMovies
        binding.textStars2.text = copyObj.stars.toString()
    }

    private fun actBtn() {
        binding.button.setOnClickListener{
            Toast.makeText(applicationContext, "Hi men", Toast.LENGTH_LONG).show()
        }
    }
}