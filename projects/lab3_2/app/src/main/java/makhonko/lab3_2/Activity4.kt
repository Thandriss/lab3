package makhonko.lab3_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class Activity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity4)
    }

    override fun onBackPressed() {
        finish()
        super.onBackPressed()
    }

    fun Nav(item: android.view.MenuItem) {}
}