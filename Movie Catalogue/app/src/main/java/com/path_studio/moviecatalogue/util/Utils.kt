package com.path_studio.moviecatalogue.util

import java.text.SimpleDateFormat
import java.util.*

object Utils {

    fun changeStringToDateFormat(value: String): String{
        try {
            val strDate: String = value

            //current date format
            val dateFormat: SimpleDateFormat = SimpleDateFormat("MM/dd/yyyy")
            val objDate: Date = dateFormat.parse(strDate)

            //Expected date format
            val dateFormat2 = SimpleDateFormat("MMM dd, yyyy")
            return dateFormat2.format(objDate)
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return ""
    }

}