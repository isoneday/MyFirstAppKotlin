package com.isoneday.myfirstappkotlin.makanan

class Makanan {
    //todo 1.3 deklarasi variable
    var nama: String? = null
    var detail: String? = null
    var gambar: Int? = null

    //todo 1.4 buat construktor
    constructor(nama: String?, detail: String?, gambar: Int?) {
        this.nama = nama
        this.detail = detail
        this.gambar = gambar
    }
}