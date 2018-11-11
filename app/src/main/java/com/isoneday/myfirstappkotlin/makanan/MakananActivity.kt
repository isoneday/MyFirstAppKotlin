package com.isoneday.myfirstappkotlin.makanan

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.isoneday.myfirstappkotlin.R
import kotlinx.android.synthetic.main.activity_makanan.*
import kotlinx.android.synthetic.main.customlayout.view.*

class MakananActivity : AppCompatActivity() {
    //todo 1.2 deklarasi array berdasarkan modelnya
    var listmakanan = ArrayList<Makanan>()
    //todo 1.5 buat sebuah adapter ( untuk menghubungkan antara view dengan data)
    var adapter: MakananAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_makanan)
        listmakanan.add(Makanan("Rendang", "rendang adalah makanan no 1 terenak", R.drawable.rendang))
        listmakanan.add(Makanan("sate", "sate adalah makanan no 1 terenak", R.drawable.sate))
        listmakanan.add(Makanan("bakso", "bakso adalah makanan no 1 terenak", R.drawable.bakso))
        listmakanan.add(Makanan("soto", "soto adalah makanan no 1 terenak", R.drawable.soto))
        listmakanan.add(Makanan("nasi kuning", "nasi kuning adalah makanan no 1 terenak", R.drawable.nasikuning))
        // inisialiasi adapter  dan buat konstruktor
        adapter = MakananAdapter(this, listmakanan)
        //isi adapter ke view
        gvListFood.adapter = adapter
    }

    class MakananAdapter : BaseAdapter {
        var listmakanan = ArrayList<Makanan>()
        var context: Context? = null


        constructor(makananActivity: MakananActivity, listmakanan: ArrayList<Makanan>) {
            this.listmakanan = listmakanan
            context = makananActivity
        }

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            var makanan = this.listmakanan[p0]
            //inflater = suata layanan yang membuat sebuah tampilan menjadi dalam bentuk popup
            var inflater = context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            var tampilan = inflater.inflate(R.layout.customlayout, null)
            tampilan.ivFoodImage.setImageResource(makanan.gambar!!)
            tampilan.tvName.text = makanan.nama
            return tampilan
        }

        override fun getItem(p0: Int): Any {
            return listmakanan[p0]
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getCount(): Int {
            return listmakanan.size
        }
l

    }


}
