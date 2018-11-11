package com.isoneday.myfirstappkotlin.makanan

import android.os.Bundle
import android.support.v7.app.ActionBar

import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.isoneday.myfirstappkotlin.R
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.content_detail.*
import org.jetbrains.anko.startActivity

class DetailActivity : AppCompatActivity() {
  private  var nama : ActionBar? =null
var a : Button? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setSupportActionBar(toolbar)
        val tangkapdata = intent.extras
        var link =tangkapdata.getInt("l")
        fab.setOnClickListener { view ->
            //todo 1.10 pindah kelaman wikipedia sesuai item yang pilih
            startActivity<WikiMakananActivity>(
                "web" to link
            )
        }
       //todo 1.9 set data ke view dari activity pengirim
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        nama =supportActionBar
        tvdetail.text=tangkapdata.getString("d")
        ivdetail.setImageResource(tangkapdata.getInt("g"))
      //  tvNamedetail.text=tangkapdata.getString("n")
        nama?.title =tangkapdata.getString("n")
    }
}
