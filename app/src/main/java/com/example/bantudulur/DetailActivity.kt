package com.example.bantudulur

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import android.widget.Toast
import org.jetbrains.anko.image

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_TITTLE = "extra_tittle"
        const val EXTRA_DETAIL = "extra_detail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val bantuSekarang: Button = findViewById(R.id.bantu)

        val photo = intent.getIntExtra(DetailActivity.EXTRA_PHOTO, -1) //untuk int nilai defaultnya -1
        val title = intent.getStringExtra(DetailActivity.EXTRA_TITTLE)
        val detail = intent.getStringExtra(DetailActivity.EXTRA_DETAIL)

        val tvImageReceived: ImageView = findViewById(R.id.item_image)
        val tvTittleReceived: TextView = findViewById(R.id.item_title)
        val tvDetailReceived: TextView = findViewById(R.id.item_detail)

        Glide.with(this)
            .load(photo)
            .into(tvImageReceived)
        tvTittleReceived.text = title
        tvDetailReceived.text = detail

        //Set Untuk Back Arrow
        findViewById<ImageView>(R.id.back).setOnClickListener {
            onBackPressed()
        }

        //Set Untuk Bantu Sekarang
        bantuSekarang.setOnClickListener{
            Toast.makeText(this, "Anda Membantu!", Toast.LENGTH_LONG).show()
        }

    }
}