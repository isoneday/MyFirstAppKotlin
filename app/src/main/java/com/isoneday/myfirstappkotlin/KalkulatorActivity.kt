package com.isoneday.myfirstappkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_kalkulator.*

class KalkulatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator)

        btntambah.setOnClickListener {
            if (validate()) {
                calculate("+")
            } else {
                Toast.makeText(this, "Tidak boleh kosong", Toast.LENGTH_SHORT)
            }
        }
        btntambah.setOnClickListener {
            if (validate()) {
                calculate("-")
            } else {
                Toast.makeText(this, "Tidak boleh kosong", Toast.LENGTH_SHORT)
            }
        }
        btntambah.setOnClickListener {
            if (validate()) {
                calculate("*")
            } else {
                Toast.makeText(this, "Tidak boleh kosong", Toast.LENGTH_SHORT)
            }
        }
        btntambah.setOnClickListener {
            if (validate()) {
                calculate("/")
            } else {
                Toast.makeText(this, "Tidak boleh kosong", Toast.LENGTH_SHORT)
            }
        }

    }

    private fun calculate(s: String) {
        if (s == "+") {
            txtresult.text = (et_number1.text.toString().toDouble() + et_number2.text.toString().toDouble()).toString()
        }
        when (s) {
            "+" -> txtresult.text =
                    (et_number1.text.toString().toDouble() + et_number2.text.toString().toDouble()).toString()
            "-" -> txtresult.text =
                    (et_number1.text.toString().toDouble() + et_number2.text.toString().toDouble()).toString()
            "/" -> txtresult.text =
                    (et_number1.text.toString().toDouble() + et_number2.text.toString().toDouble()).toString()
            "*" -> txtresult.text =
                    (et_number1.text.toString().toDouble() + et_number2.text.toString().toDouble()).toString()
            else -> {
                print("tidak ada operator")
            }
        }
    }

    private fun validate(): Boolean {
        if (et_number1.text.isEmpty() || et_number2.text.isEmpty()) {
            return false
        } else {
            return true
        }
    }
}
