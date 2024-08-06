package com.buzztech.kurbplaceradmin.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.buzztech.kurbplaceradmin.R
import com.buzztech.kurbplaceradmin.ui.auth.LoginActivity
import com.buzztech.kurbplaceradmin.util.postDelayed

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        postDelayed(1000) {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}