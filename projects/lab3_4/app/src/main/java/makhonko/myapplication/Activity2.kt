package makhonko.myapplication


import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


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
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
    }

    fun Nav(item: android.view.MenuItem) {
        val intent = Intent(this, Activity4::class.java)
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
        startActivity(intent)
    }
}
