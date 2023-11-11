package com.example.kisileruygulamasi.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kisileruygulamasi.data.entity.Kisiler
import com.example.kisileruygulamasi.data.repo.KişilerREposity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AnasayfaViewModel:ViewModel() {
    var krepo= KişilerREposity()
    var kisilerListesi= MutableLiveData<List<Kisiler>>()

    init { //anasayfa viewmodelin oluşulduğu an çalış

kisilerYukle()

    }
    fun sil(kişi_id:Int){
        CoroutineScope(Dispatchers.Main).launch {
            krepo.sil(kişi_id)
            kisilerYukle()
        }
    }



    fun kisilerYukle() {
        CoroutineScope(Dispatchers.Main).launch{
          kisilerListesi.value =krepo.kisilerYukle()
        }
    }

    fun ara(aramaKelimesi:String) {
        CoroutineScope(Dispatchers.Main).launch{
            kisilerListesi.value =krepo.ara(aramaKelimesi)
        }
    }


}