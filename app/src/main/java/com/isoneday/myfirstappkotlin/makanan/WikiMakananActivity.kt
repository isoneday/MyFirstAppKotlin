package com.isoneday.myfirstappkotlin.makanan

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.webkit.WebViewClient
import com.isoneday.myfirstappkotlin.R
import kotlinx.android.synthetic.main.activity_wiki_makanan.*



class WikiMakananActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wiki_makanan)
        webmakanan.settings.javaScriptEnabled =true
        webmakanan.webViewClient = WebViewClient()


        val tangkapdata =intent.extras
        var linkweb =tangkapdata.getInt("web",0)
        webmakanan.loadUrl(resources.getString(linkweb))
    }
}
