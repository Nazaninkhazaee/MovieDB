package com.coding.moviemvvm.ui.popular_movie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.coding.moviemvvm.R
import com.coding.moviemvvm.ui.single_movie_details.SingleMovieActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
            val intent = Intent(this, SingleMovieActivity::class.java)
            intent.putExtra("id",299534 )
            this.startActivity(intent)
        }

    }
}