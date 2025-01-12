package com.example.pam15

import android.app.Application
import com.example.pam15.di.MahasiswaContainer

class MahasiswaApp : Application(){
    lateinit var containerApp: MahasiswaContainer //Fungsinya menyimpan instance dari mahasiswa container
    override fun onCreate() {
        super.onCreate()
        containerApp = MahasiswaContainer( this) //Membuat instance Mahasiswa containerApp
        //instance = object yang dibuat dari class
    }
}
