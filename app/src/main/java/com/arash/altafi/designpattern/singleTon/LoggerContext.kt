package com.arash.altafi.designpattern.singleTon

object LoggerContext {

    //first way  (eager)
    /*private var logger: Logger = Logger()

    fun getLogger(): Logger {
        return logger
    }*/

    //second way   (lazy)
    private var logger: Logger? = null

    fun getLogger(): Logger {
        if (logger == null)
            logger = Logger()
        return logger as Logger
    }

}