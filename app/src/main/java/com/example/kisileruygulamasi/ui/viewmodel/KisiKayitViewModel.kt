package com.example.kisileruygulamasi.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.kisileruygulamasi.data.repo.KişilerREposity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class KisiKayitViewModel:ViewModel() {
    fun kaydet(kisi_ad:String,kisi_tel:String){
        var krepo=KişilerREposity()

        fun kaydet(kisi_ad: String,kisi_tel: String){
            CoroutineScope(Dispatchers.Main).launch {
                krepo.kaydet(kisi_ad,kisi_tel)

            }

        }
    }
}