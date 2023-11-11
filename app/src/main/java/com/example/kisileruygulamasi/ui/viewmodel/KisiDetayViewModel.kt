package com.example.kisileruygulamasi.ui.viewmodel

import android.view.View
import androidx.lifecycle.ViewModel
import com.example.kisileruygulamasi.data.repo.KişilerREposity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class KisiDetayViewModel :ViewModel() {
    var krepo= KişilerREposity()

     fun guncelle(kisi_id:Int,kisi_ad:String,kisi_tel:String){
     CoroutineScope(Dispatchers.Main).launch{
       krepo.guncelle(kisi_id,kisi_ad,kisi_tel)
     }

     }




}