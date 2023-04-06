package com.arash.altafi.designpattern.singleTon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.designpattern.R
import com.arash.altafi.designpattern.singleTon.models.Log

class SingleTonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_ton)

        val logger = LoggerContext.getLogger()
        logger.addLogg(Log("TEST"))
    }
}