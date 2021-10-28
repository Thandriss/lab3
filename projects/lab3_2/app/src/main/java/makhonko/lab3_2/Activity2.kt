package makhonko.lab3_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.util.logging.Logger

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2)
    }

    fun changeActivity1(view: View) {
        finish()
    }

    fun changeActivity3(view: View) {
        val intent = Intent(this, Activity3::class.java)
        startActivityForResult(intent, 1)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (resultCode == 1) {
            //
        } else if (resultCode == 2) {
            finish()
        }
        super.onActivityResult(requestCode, resultCode, data)
    }

    fun Nav(item: android.view.MenuItem) {
        val intent = Intent(this, Activity4::class.java)
        startActivity(intent)
    }
}