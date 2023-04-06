package com.arash.altafi.designpattern.adapter.players

import android.util.Log
import com.arash.altafi.designpattern.adapter.playersInterface.AdvancedMediaPlayer

class MP3Player : AdvancedMediaPlayer {

    override fun playMp3(fileName: String) {
        Log.e("AdapterDesignPattern", "VLCPlayer player playVlc: fileName = $fileName")
    }

    override fun playMP4(fileName: String) {
        TODO("Not yet implemented")
    }

}