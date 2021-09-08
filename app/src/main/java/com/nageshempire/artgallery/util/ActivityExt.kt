package com.nageshempire.artgallery.util

import android.app.Activity
import android.view.WindowManager

@Suppress("DEPRECATION")
fun Activity.setStatusBarColor(color: Int) {
    window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
    window.statusBarColor = color
}