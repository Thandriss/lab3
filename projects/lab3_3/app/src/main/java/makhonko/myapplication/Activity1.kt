package makhonko.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.util.logging.Logger

class Activity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity1)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment_activity_main2) as NavHostFragment
        val navController = navHostFragment.navController
        findViewById<BottomNavigationView>(R.id.nav_view).setupWithNavController(navController)
    }

    fun changeActivity(view: View) {
        val intent = Intent(this, Activity2::class.java)
        startActivity(intent)
    }

    fun Nav(item: android.view.MenuItem) {
        val intent = Intent(this, Activity4::class.java)
        startActivity(intent)
    }
}