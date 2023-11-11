package com.example.kisileruygulamasi.data.datasource

import android.util.Log
import com.example.kisileruygulamasi.data.entity.Kisiler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class KişilerDataSource {

    suspend fun kisilerYukle() : List<Kisiler> =
    withContext(Dispatchers.IO){
        val kisilerListesi = ArrayList<Kisiler>()
        val k1 = Kisiler(1,"busra","7878")
        val k2 = Kisiler(2,"elif","3131")
        val k3 = Kisiler(3,"melis","9999")
        kisilerListesi.add(k1)
        kisilerListesi.add(k2)
        kisilerListesi.add(k3)
        return@withContext kisilerListesi

    }
     suspend fun ara(aramaKelimesi:String) : List<Kisiler> =
             withContext(Dispatchers.IO){
                 val kisilerListesi = ArrayList<Kisiler>()
                 val k1 = Kisiler(1,"busra","7878")
                 kisilerListesi.add(k1)
                 return@withContext kisilerListesi
    }



    suspend fun kaydet(kisi_ad:String,kisi_tel:String){
        Log.e("Kişi Kaydet","$kisi_ad - $kisi_tel")
    }
    suspend fun guncelle(kisi_id:Int,kisi_ad:String,kisi_tel:String){
        Log.e("Kişi Kaydet","$kisi_id-$kisi_ad-$kisi_tel")
    }
      suspend fun sil(kisi_id:Int){
        Log.e("Kişi Sil",kisi_id.toString())
    }

}