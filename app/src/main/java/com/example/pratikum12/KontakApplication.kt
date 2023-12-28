package com.example.pratikum12

import android.app.Application
import com.example.pratikum12.repository.AppContainer
import com.example.pratikum12.repository.KontakContainer

class KontakApplication : Application(){
    lateinit var container: AppContainer

    override fun onCreate (){
        super.onCreate()
        container = KontakContainer()
    }
}