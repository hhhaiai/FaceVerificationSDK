package com.faceVerify.test

import android.app.Application
import android.content.res.Configuration
import android.os.Environment

/**
 * global param init
 *
 *
 */
class FaceApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        //init your custom params
        CACHE_BASE_FACE_DIR = getExternalFilesDir(Environment.DIRECTORY_PICTURES).toString()
        BASE_FACE_KEY="AI_BASE_FACE_KEY"
    }

    override fun onTerminate() {
        super.onTerminate()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
    }

    override fun onLowMemory() {
        super.onLowMemory()
    }

    override fun onTrimMemory(level: Int) {
        super.onTrimMemory(level)
    }

    public companion object {
        lateinit var  CACHE_BASE_FACE_DIR: String
        lateinit var  BASE_FACE_KEY: String

    }
}