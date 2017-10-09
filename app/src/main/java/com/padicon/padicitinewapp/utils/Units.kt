package com.padicon.padicitinewapp.utils

import android.content.res.Resources
import android.view.View
import android.view.ViewGroup


/**
 * Created by rinaldysam on 10/2/17.
 */

object Units {
     fun  toPx(i: Int) {
        i * Resources.getSystem().displayMetrics.density
     }

    fun View.setMargins(
            left: Int? = null,
            top: Int? = null,
            right: Int? = null,
            bottom: Int? = null
    ) {
        val lp = layoutParams as? ViewGroup.MarginLayoutParams
                ?: return

        lp.setMargins(
                left ?: lp.leftMargin,
                top ?: lp.topMargin,
                right ?: lp.rightMargin,
                bottom ?: lp.rightMargin
        )

        layoutParams = lp
    }
}



//val Int.dicoba: Int
//    get() = (this / Resources.getSystem().displayMetrics.density).toInt()
//val Int.px: Int
//    get() = (this / Resources.getSystem().displayMetrics.density).toInt()