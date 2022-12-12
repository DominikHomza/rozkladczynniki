package com.example.rozkladczynniki


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var liczba = findViewById<TextView>(R.id.editTextNumber)
        var przycisk = findViewById<Button>(R.id.button)
        var wynik= findViewById<TextView>(R.id.textView)


        przycisk.setOnClickListener {
            var a = liczba.text.toString().toInt()
            var x = 2
            var czynnik = ""
            while (a > 1)
            {
                while (a % x == 0)
                {
                    czynnik += (x.toString() + "  ")
                    a /= x
                }
                ++x
            }
            wynik.text = ("jej liczby pierwsze to: " + czynnik)
        }
    }
}