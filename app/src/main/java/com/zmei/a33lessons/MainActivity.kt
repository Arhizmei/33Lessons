package com.zmei.a33lessons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zmei.a33lessons.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonFragment.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.placeHolder, BlankFragment.newInstance())
                .commit()
        }

    }
}