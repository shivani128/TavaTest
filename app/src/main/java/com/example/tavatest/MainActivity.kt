package com.example.tavatest

import android.content.Intent
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
    var hanlder = Handler()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setUI()

        }
    fun setUI() {
        binding.nextTab.setOnClickListener {
            val intent = Intent(this@MainActivity,DemoListActivity::class.java);
            startActivity(intent);
        }
        setSignle()
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
    fun setSignle(){
            hanlder.postDelayed({
                binding.a.setBackgroundColor(getColor(R.color.green))
                binding.b.setBackgroundColor(getColor(R.color.white))
                binding.c.setBackgroundColor(getColor(R.color.white))
                binding.d.setBackgroundColor(getColor(R.color.white))

                val handler1 = Handler()
                handler1.postDelayed({
                    binding.a.setBackgroundColor(getColor(R.color.white))
                    binding.b.setBackgroundColor(getColor(R.color.green))
                    binding.c.setBackgroundColor(getColor(R.color.white))
                    binding.d.setBackgroundColor(getColor(R.color.white))
                    val handler3 = Handler()
                    handler3.postDelayed({
                        binding.a.setBackgroundColor(getColor(R.color.white))
                        binding.b.setBackgroundColor(getColor(R.color.white))
                        binding.c.setBackgroundColor(getColor(R.color.green))
                        binding.d.setBackgroundColor(getColor(R.color.white))
                        val handler4 = Handler()
                        handler4.postDelayed({
                            binding.a.setBackgroundColor(getColor(R.color.white))
                            binding.b.setBackgroundColor(getColor(R.color.white))
                            binding.c.setBackgroundColor(getColor(R.color.white))
                            binding.d.setBackgroundColor(getColor(R.color.green))
                            val handler5 = Handler()
                            handler5.postDelayed({
                                binding.a.setBackgroundColor(getColor(R.color.green))
                                binding.b.setBackgroundColor(getColor(R.color.white))
                                binding.c.setBackgroundColor(getColor(R.color.white))
                                binding.d.setBackgroundColor(getColor(R.color.white))
                                val handler56 = Handler()
                                handler56.postDelayed({
                                    binding.a.setBackgroundColor(getColor(R.color.white))
                                    binding.b.setBackgroundColor(getColor(R.color.white))
                                    binding.c.setBackgroundColor(getColor(R.color.white))
                                    binding.d.setBackgroundColor(getColor(R.color.green))
                                    val handler6 = Handler()
                                    handler6.postDelayed({
                                        binding.a.setBackgroundColor(getColor(R.color.white))
                                        binding.b.setBackgroundColor(getColor(R.color.white))
                                        binding.c.setBackgroundColor(getColor(R.color.green))
                                        binding.d.setBackgroundColor(getColor(R.color.white))
                                        val handler7 = Handler()
                                        handler7.postDelayed({
                                            binding.a.setBackgroundColor(getColor(R.color.white))
                                            binding.b.setBackgroundColor(getColor(R.color.green))
                                            binding.c.setBackgroundColor(getColor(R.color.white))
                                            binding.d.setBackgroundColor(getColor(R.color.white))
                                            val handler8 = Handler()
                                            handler8.postDelayed({
                                                binding.a.setBackgroundColor(getColor(R.color.green))
                                                binding.b.setBackgroundColor(getColor(R.color.white))
                                                binding.c.setBackgroundColor(getColor(R.color.white))
                                                binding.d.setBackgroundColor(getColor(R.color.white))

                                            }, 2000)
                                        }, 2000)
                                    }, 2000)
                                }, 2000)
                            }, 2000)
                        }, 2000)

                    }, 2000)
                }, 2000)
            }, 2000)
    }
    override fun onResume() {
        setSignle()
        super.onResume()
    }
}