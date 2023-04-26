package com.zmei.a33lessons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.Placeholder
import androidx.fragment.app.Fragment
import com.zmei.a33lessons.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        openFrag(BlankFragment.newInstance(), R.id.placeHolder)
        openFrag(BlankFragment2.newInstance(), R.id.placeHolder2)


    }
    private fun openFrag (f: Fragment, placeHolder: Int){
        supportFragmentManager
            .beginTransaction()
            .replace(placeHolder, f)
            .commit()
    }
}