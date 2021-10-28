package makhonko.myapplication


import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity3)
    }

    fun changeActivity1(view: View) {
        val intent = Intent(this, Activity1::class.java)
        startActivity(intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
        finish()
    }

    fun changeActivity2(view: View) {
        val intent = Intent(this, Activity2::class.java)
        startActivity(intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP))
        finish()
    }

    fun Nav(item: android.view.MenuItem) {
        val intent = Intent(this, Activity4::class.java)
        startActivity(intent)
    }
}
