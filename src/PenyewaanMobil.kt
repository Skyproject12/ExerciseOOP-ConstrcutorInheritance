fun main (args : Array<String>){
    var mobil= Mobil("10210","lexus",2,1000.0)
    var mobil1= Mobil("10211","lexus",4,1000.0)
    var pelanggan = Pelanggan("wulan")
    pelanggan.tambahTransaksi("10210",2)
    pelanggan.getPenyewaan(0).addMobil(mobil)
    pelanggan.getPenyewaan(0).addMobil(mobil1)

    mobil.tampilMobil()
    println("====================")
    pelanggan.Display()

}