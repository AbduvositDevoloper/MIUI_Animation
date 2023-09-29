package com.uz.abduvosit.miuianimation

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.uz.abduvosit.miuianimation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    lateinit var myHandler: Handler
    var img = 0
    val loopImages = listOf(
        R.drawable.logo0001,
        R.drawable.logo0002,
        R.drawable.logo0003,
        R.drawable.logo0004,
        R.drawable.logo0005,
        R.drawable.logo0006,
        R.drawable.logo0007,
        R.drawable.logo0008,
        R.drawable.logo0009,
        R.drawable.logo0010,
        R.drawable.logo0011,
        R.drawable.logo0012,
        R.drawable.logo0013,
        R.drawable.logo0014,
        R.drawable.logo0015,
        R.drawable.logo0016,
        R.drawable.logo0017,
        R.drawable.logo0018,
        R.drawable.logo0019,
        R.drawable.logo0020,
        R.drawable.logo0021,
        R.drawable.logo0022,
        R.drawable.logo0023,
        R.drawable.logo0024,
        R.drawable.logo0025,
        R.drawable.logo0026,
        R.drawable.logo0027,
        R.drawable.logo0028,
        R.drawable.logo0029,
        R.drawable.logo0030,
        R.drawable.logo0031,
        R.drawable.logo0032,
        R.drawable.logo0033,
        R.drawable.logo0034,
        R.drawable.logo0035,
        R.drawable.logo0036,
        R.drawable.logo0037,
        R.drawable.logo0038,
        R.drawable.logo0039,
        R.drawable.logo0040,
        R.drawable.logo0041,
        R.drawable.logo0042,
        R.drawable.logo0043,
        R.drawable.logo0044,
        R.drawable.logo0045,
        R.drawable.logo0046,
        R.drawable.logo0047,
        R.drawable.logo0048,
        R.drawable.logo0049,
        R.drawable.logo0050,
        R.drawable.logo0051,
        R.drawable.logo0052,
        R.drawable.logo0053,
        R.drawable.logo0054,
        R.drawable.logo0055,
        R.drawable.logo0056,
        R.drawable.logo0057,
        R.drawable.logo0059,
        R.drawable.logo0060,
        R.drawable.logo0061,
        R.drawable.logo0062,
        R.drawable.logo0063,
        R.drawable.logo0064,
        R.drawable.logo0065,
        R.drawable.logo0066,
        R.drawable.logo0067,
        R.drawable.logo0068,
        R.drawable.logo0069,
        R.drawable.logo0070,
        R.drawable.logo0071,
        R.drawable.logo0072,
        R.drawable.logo0073,
        R.drawable.logo0074,
        R.drawable.logo0075,
        R.drawable.logo0076,
        R.drawable.logo0077,
        R.drawable.logo0078,
        R.drawable.logo0079,
        R.drawable.logo0080,
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        myHandler = Handler(Looper.getMainLooper())

        runLogs()
    }

    private fun runLogs() {
        myHandler.postDelayed(myRunnable, 10)
    }

    val myRunnable: Runnable = object : Runnable {
        override fun run() {
            try {
                binding.image.setImageResource(loopImages[img])
                img++
            } catch (e: Exception) {
                startActivity(Intent(this@MainActivity, SbrosActivity::class.java))

            }
            myHandler.postDelayed(this, 10)
        }
    }
}