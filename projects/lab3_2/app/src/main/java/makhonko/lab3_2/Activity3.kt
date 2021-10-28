package makhonko.lab3_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class Activity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity3)
    }

    fun changeActivity1(view: View) {
        val intent = Intent()
        setResult(2, intent)
        finish()
    }

    fun changeActivity2(view: View) {
        val intent = Intent()
        setResult(1, intent)
        finish()
    }

    fun Nav(item: android.view.MenuItem) {
        val intent = Intent(this, Activity4::class.java)
        startActivity(intent)
    }
}