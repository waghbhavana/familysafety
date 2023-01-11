package com.example.familysafety

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)
        var bottNavigationBar= findViewById<BottomNavigationView>(R.id.bottom_nav_view)
        bottNavigationBar.setOnItemSelectedListener {

            if (it.itemId==R.id.nav_guard){
                inflateFragment(GuardFragment.newInstance())
            }else if(it.itemId==R.id.nav_home){
                inflateFragment(HomeFragment.newInstance())
            }else if (it.itemId==R.id.nav_dashbord){
                inflateFragment(DashboardFragment.newInstance())
            }else if(it.itemId==R.id.nav_profile){
            inflateFragment(ProfileFragment.newInstance())
        }
            true
        }
    }


    private fun inflateFragment(fragment: Fragment) {
        var transaction= supportFragmentManager.beginTransaction();
        transaction.replace(R.id.container,fragment)
        transaction.commit()
    }
}