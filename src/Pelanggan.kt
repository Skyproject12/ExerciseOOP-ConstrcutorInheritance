class Pelanggan {
    var nama=""
    val listpenyewaan: Array <Penyewaan> = arrayOf (Penyewaan("",0),Penyewaan("",0),Penyewaan("",0),Penyewaan("",0))

    var nPenyewaan = 0

    constructor (nama: String) {
        this.nama= nama
    }
    fun tambahTransaksi (id: String, n : Int) {
        var sewa = Penyewaan(id,n)
        listpenyewaan[nPenyewaan] = sewa
        nPenyewaan ++
    }
    fun getPenyewaan (i :  Int): Penyewaan {
        return listpenyewaan[i]
    }
    fun Display(){
        println("Nama"+nama)
        for(i in 0..nPenyewaan-1){
            println("Nomer Penyewaan"+listpenyewaan[i].getId())
            for(x in 0..listpenyewaan[i].getnMobil()-1){
                println(listpenyewaan[i].getMobil(x))
            }
        }
    }
}