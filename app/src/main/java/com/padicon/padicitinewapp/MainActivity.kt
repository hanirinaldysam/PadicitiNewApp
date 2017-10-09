package com.padicon.padicitinewapp

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.padicon.padicitinewapp.activities.flight.Reservation
import com.padicon.padicitinewapp.utils.BottomNavigationViewHelper
import com.padicon.padicitinewapp.utils.LocaleConfig
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.grid_cat_view.*








class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View) {
        when(v.id){
            R.id.lnrCatFlight -> {
               val i = Intent(this, Reservation::class.java)
               startActivity(i)
            }
        }
    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.nav_home -> {
                LocaleConfig.changeLang(this, "en")
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_mytrip -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_promos -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_profile -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_more -> {
                LocaleConfig.changeLang(this, "in")
                return@OnNavigationItemSelectedListener true
            }

        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nav_bottom.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        BottomNavigationViewHelper.disableShiftMode(nav_bottom)

        lnrCatFlight.setOnClickListener(this)


        (pagerSlideShow.getLayoutParams()).height = (resources.displayMetrics.heightPixels).toInt()
    }
}




