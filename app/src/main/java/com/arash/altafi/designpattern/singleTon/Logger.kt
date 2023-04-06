package com.arash.altafi.designpattern.singleTon

import com.arash.altafi.designpattern.singleTon.models.Log

class Logger {

    fun addLogg(log: Log) {
        if (log.message == "") return
        android.util.Log.i("SingleTonPattern", "addLogg: ${log.message}")
    }

}