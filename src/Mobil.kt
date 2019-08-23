class Mobil {
    var id=""
    var nama_merk=""
    var jumlah=0
    var harga=0.0
    constructor(id:String, nama_merk: String, jumlah:Int, harga:Double){
        this.id=id
        this.nama_merk = nama_merk
        this.jumlah = jumlah
        this.harga= harga
    }
    fun getIds():String{
        return id
    }
    fun setIds(id:String){
        this.id=id
    }
    fun getNama_merks():String{
        return nama_merk
    }
    fun setNama_merks(nama_merk: String){
        this.nama_merk=nama_merk
    }
    fun getJumlahs():Int {
        return jumlah
    }
    fun setJumlahs(jumlah:Int){
        this.jumlah=jumlah
    }
    fun getHargas () : Double {
        return harga
    }
    fun setHargas (harga: Double)  {
        this.harga=harga
    }
    fun tampilMobil () {
        println("Mobil"+nama_merk)
        println("jumlah mobil sisa Sebanyak"+jumlah)
    }
}