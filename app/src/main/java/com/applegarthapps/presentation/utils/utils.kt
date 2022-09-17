package com.applegarthapps.presentation.utils

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.*


@SuppressLint("SimpleDateFormat")
fun formatDate(time: Long): String {
    val date = Date(time)
    val format = SimpleDateFormat("EEE, d MMM hh:mm aaa",
        Locale.getDefault()
        )
    return format.format(date)
}