package com.test.kotlinlearn.utils

import android.app.Activity
import com.test.kotlinlearn.modul.Config
import java.util.concurrent.ConcurrentHashMap

/**
 *internal 禁止跨model访问该类
 *@author lidexin
 *@email tuz1425@dingtalk.com
 *@date 2021/6/29
 */
internal object BuildManger {

    private val windowMap = ConcurrentHashMap<String, BuildHelper>()
    private var isCreateHelper = false

    fun create(activity: Activity, config: Config) {
        //todo 可以做二次 验证。
        //todo 可以在新起类 做实际操作.
        //todo call back 在config里面。
        if (!isCreateHelper) {
            windowMap["helper"] =  BuildHelper(activity, config).apply { createHelper() }
            isCreateHelper = true
        }
    }

    fun printLog(message: String) {
        windowMap["helper"]?.helperPrintLog(message)
    }

}