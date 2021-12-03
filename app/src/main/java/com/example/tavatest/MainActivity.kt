package com.example.tavatest

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.annotation.RequiresApi
import androidx.databinding.DataBindingUtil
import com.example.tavatest.databinding.ActivityMainBinding
@RequiresApi(Build.VERSION_CODES.M)
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var hanlder=Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setUI()


        hanlder.postDelayed({
          setUI()
        },2000)
    }


    fun setUI() {

        binding.AmbA.setOnClickListener {
            binding.a.setBackgroundColor(getColor(R.color.green))
            binding.b.setBackgroundColor(getColor(R.color.white))
            binding.c.setBackgroundColor(getColor(R.color.white))
            binding.d.setBackgroundColor(getColor(R.color.white))
        }
        binding.BAMB.setOnClickListener {
            binding.a.setBackgroundColor(getColor(R.color.white))
            binding.b.setBackgroundColor(getColor(R.color.green))
            binding.c.setBackgroundColor(getColor(R.color.white))
            binding.d.setBackgroundColor(getColor(R.color.white))
        }
        binding.CAMB.setOnClickListener {
            binding.a.setBackgroundColor(getColor(R.color.white))
            binding.b.setBackgroundColor(getColor(R.color.white))
            binding.c.setBackgroundColor(getColor(R.color.green))
            binding.d.setBackgroundColor(getColor(R.color.white))
        }
        binding.DABM.setOnClickListener {
            binding.a.setBackgroundColor(getColor(R.color.white))
            binding.b.setBackgroundColor(getColor(R.color.white))
            binding.c.setBackgroundColor(getColor(R.color.white))
            binding.d.setBackgroundColor(getColor(R.color.green))
        }
    }
}