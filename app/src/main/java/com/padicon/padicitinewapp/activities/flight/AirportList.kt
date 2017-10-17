package com.padicon.padicitinewapp.activities.flight

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.LinearLayout
import com.padicon.padicitinewapp.R
import com.padicon.padicitinewapp.utils.Transition

class AirportList : AppCompatActivity() {

    lateinit var  lnrTypeTrip: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flight_airport)


    }


    fun onClick(v: View) {
        when(v.id){
            R.id.btnBack -> {
                val i = Intent(this, Reservation::class.java)
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