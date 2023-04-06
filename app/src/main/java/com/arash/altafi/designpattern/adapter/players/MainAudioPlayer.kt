package com.arash.altafi.designpattern.adapter.players

import com.arash.altafi.designpattern.adapter.MediaAdapter
import com.arash.altafi.designpattern.adapter.playersInterface.MediaPlayer

class MainAudioPlayer : MediaPlayer {

    private lateinit var mediaAdapter: MediaAdapter

    override fun play(audioType: String, fileName: String) {
        mediaAdapter = MediaAdapter(audioType)
        mediaAdapter.play(audioType, fileName)
    }
}