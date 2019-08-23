class Penyewaan {
    private var ids=""
    val listMobil: Array <Mobil> = arrayOf (Mobil("10000","kijang",2,10000.0),Mobil("10001","ferrari",4,10000.0),Mobil("10002","fortuner",6,10000.0),Mobil("10004","panter",10,10000.0))
    private var nMobil =0

    constructor(ids:String, nMobil: Int){
        this.ids= ids
        this.nMobil =0
    }
    fun getId():String {
        return ids;
    }
    fun getnMobil () : Int {
        return nMobil
    }
    fun getListMobil():Mobil{
        return listMobil[0];
    }
    fun addMobil (mobil: Mobil){
        listMobil[nMobil] = mobil
        nMobil++
    }
    fun getMobil (i : Int) : Mobil {
        return listMobil[i]
    }

}