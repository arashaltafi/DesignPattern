package com.arash.altafi.designpattern.adapter.players

import android.util.Log
import com.arash.altafi.designpattern.adapter.playersInterface.AdvancedMediaPlayer

class MP4Player : AdvancedMediaPlayer {

    override fun playMp3(fileName: String) {
        TODO("Not yet implemented")
    }

    override fun playMP4(fileName: String) {
        Log.e("AdapterDesignPattern", "MP4 player playMP4: fileName = $fileName")
    }

}