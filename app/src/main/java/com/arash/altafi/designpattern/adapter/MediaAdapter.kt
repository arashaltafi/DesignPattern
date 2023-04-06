package com.arash.altafi.designpattern.adapter

import com.arash.altafi.designpattern.adapter.players.MP4Player
import com.arash.altafi.designpattern.adapter.players.MP3Player
import com.arash.altafi.designpattern.adapter.playersInterface.AdvancedMediaPlayer
import com.arash.altafi.designpattern.adapter.playersInterface.MediaPlayer

class MediaAdapter(audioType: String)  : MediaPlayer {

    private var advancedMediaPlayer : AdvancedMediaPlayer? = null

    init {
        when(audioType){
            "mp3" -> advancedMediaPlayer = MP3Player()
            "mp4" -> advancedMediaPlayer = MP4Player()
        }
    }

    override fun play(audioType: String, fileName: String) {
        when(audioType){
            "mp3" -> advancedMediaPlayer?.playMp3(fileName)
            "mp4" -> advancedMediaPlayer?.playMP4(fileName)
        }
    }
}