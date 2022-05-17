package com.example.uyangi.intro

import android.app.Activity
import android.os.Bundle
import android.util.Log
import com.example.uyangi.api.UyangiApi
import com.example.uyangi.common.Prefs
import com.example.uyangi.signin.SigninActivity
import kotlinx.coroutines.*
//import com.example.uyangi.common.Prefs
//import com.example.uyangi.product.ProductMainActivity
//import com.example.uyangi.signin.SigninActivity
import org.jetbrains.anko.setContentView
import org.jetbrains.anko.startActivity
import java.lang.Exception

class IntroActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        IntroActivityUI().setContentView(this)
        GlobalScope.launch(Dispatchers.Main) {
            delay(1000)
            startActivity<SigninActivity>()

//            if(Prefs.token.isNullOrEmpty()) {
//                startActivity<SigninActivity>()
//            } else {
//                // startActivity<ProductMainActivity>()
//
//            }

            finish()
        }
    }

}