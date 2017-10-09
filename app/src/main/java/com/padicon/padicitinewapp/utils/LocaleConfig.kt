package com.padicon.padicitinewapp.utils

/**
 * Created by rinaldysam on 9/27/17.
 */


import android.app.Activity
import android.content.Context
import android.preference.PreferenceManager
import java.util.Locale

object LocaleConfig {
    fun changeLang(context: Context, langpos: String) {
        val activity = context as Activity
        when (langpos) {
            "id" // Indonesian
            -> PreferenceManager.getDefaultSharedPreferences(activity.applicationContext).edit().putString("LANG", "in").commit()
            else // By default set to english
            -> PreferenceManager.getDefaultSharedPreferences(activity.applicationContext).edit().putString("LANG", "en").commit()
        }
        val config = activity.baseContext.resources.configuration
        val locale = Locale(langpos)
        Locale.setDefault(locale)
        config.locale = locale
        activity.baseContext.resources.updateConfiguration(config, activity.baseContext.resources.displayMetrics)
        activity.recreate()
    }
}