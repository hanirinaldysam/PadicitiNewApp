package com.padicon.padicitinewapp.activities.flight

/**
 * Created by rinaldysam on 10/2/17.
 */


import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.LinearLayout
import com.padicon.padicitinewapp.R
import com.padicon.padicitinewapp.utils.Transition


class Reservation : AppCompatActivity() {

    lateinit var  lnrTypeTrip: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flight_reserve)


    }


    fun onClick(v: View) {
        when(v.id){
            R.id.btnReserve -> {
                val i = Intent(this, SearchResult::class.java)
                startActivity(i)
            }
            R.id.txvOrg -> {
                val i = Intent(this, AirportList::class.java)
                startActivity(i)
            }
            R.id.txvDes -> {
                val i = Intent(this, AirportList::class.java)
                startActivity(i)
            }
            R.id.rdTypeTripOW -> {
                Transition.expand(lnrTypeTrip)
            }
            R.id.rdTypeTripRT -> {
                Transition.collapse(lnrTypeTrip)
            }
        }
    }
}
