package com.isoneday.myfirstappkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.latihan1)
    Toast.makeText(this,"onCreate",Toast.LENGTH_LONG).show()
    Log.i("lifeact","oncreate")
        var a : String? = "angka1"
        print(a)
    }



    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"onstart",Toast.LENGTH_LONG).show()
        Log.i("lifeact","onstart")

    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"onstop",Toast.LENGTH_LONG).show()
        Log.i("lifeact","onstop")

    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,"onrestart",Toast.LENGTH_LONG).show()
        Log.i("lifeact","onrestart")

    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"onDestroy",Toast.LENGTH_LONG).show()
        Log.i("lifeact","onDestroy")

    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"onPause",Toast.LENGTH_LONG).show()
        Log.i("lifeact","onpause")

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"onResume",Toast.LENGTH_LONG).show()
        Log.i("lifeact","onResume")


    }

}
