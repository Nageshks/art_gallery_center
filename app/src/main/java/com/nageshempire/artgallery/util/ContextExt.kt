package com.nageshempire.artgallery.util

import android.content.Context

fun Context.dp(px: Int): Int = (px / resources.displayMetrics.density).toInt()
fun Context.dimen(id: Int): Float = resources.getDimension(id)