package com.test.kotlinlearn.utils

import android.app.Activity
import android.util.Log
import com.test.kotlinlearn.modul.Config

/**
 * @author lidexin
 * @email tuz1425@dingtalk.com
 * @date 2021/6/29
 */
internal class BuildHelper(var activity: Activity, var config: Config) {

    fun createHelper() {
        config.callback?.builder?.success?.invoke("create success")
    }

    fun helperPrintLog(message: String) {
        Log.d("MANGER", message)
        config.callback?.builder?.error?.invoke(1, "print success")
    }

}