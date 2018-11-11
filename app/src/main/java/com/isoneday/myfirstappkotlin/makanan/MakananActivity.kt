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
import org.jetbrains.anko.startActivity

class MakananActivity : AppCompatActivity() {
    //todo 1.2 deklarasi array berdasarkan modelnya
    var listmakanan = ArrayList<Makanan>()
    //todo 1.5 buat sebuah adapter ( untuk menghubungkan antara view dengan data)
    var adapter: MakananAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_makanan)
        listmakanan.add(Makanan("Rendang", "rendang adalah makanan no 1 terenak", R.drawable.rendang,R.string.linkrendang))
        listmakanan.add(Makanan("sate", "sate adalah makanan no 1 terenak", R.drawable.sate,R.string.linkrendang))
        listmakanan.add(Makanan("bakso", "bakso adalah makanan no 1 terenak", R.drawable.bakso,R.string.linkrendang))
        listmakanan.add(Makanan("soto", "soto adalah makanan no 1 terenak", R.drawable.soto,R.string.linkrendang))
        listmakanan.add(Makanan("nasi kuning", "nasi kuning adalah makanan no 1 terenak", R.drawable.nasikuning,R.string.linkrendang))
        // inisialiasi adapter  dan buat konstruktor
        adapter = MakananAdapter(this, listmakanan)
        //isi adapter ke view
        gvListFood.adapter = adapter
        //todo 1.6 aksi ketika item di grid di klik
        gvListFood.setOnItemClickListener { adapterView, view, i, l ->
            //todo 1.7 buat activity baru untuk halaman detail
            val makanan = this.listmakanan[i]
            //cara 1 (kotlin manual) perpindah activity dengan membawa data
//            val intent = Intent(this,DetailActivity::class.java)
//            intent.putExtra("n",makanan.nama)
//            intent.putExtra("g",makanan.gambar)
//            intent.putExtra("d",makanan.detail)
//            startActivity(intent)
//
            //cara 2 (dengan anko common) perpindahan activity dengan membawa data
            startActivity<DetailActivity>(
                "n" to makanan.nama,
                "g" to makanan.gambar,
                "d" to makanan.detail,
                "l" to makanan.link
            )

        }
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


    }


}
