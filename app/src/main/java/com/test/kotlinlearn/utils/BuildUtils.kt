package com.test.kotlinlearn.utils

import android.app.Activity
import com.test.kotlinlearn.modul.Config

/**
 *
 *@author lidexin
 *@email tuz1425@dingtalk.com
 *@date 2021/6/29
 */
class BuildUtils {

    companion object {
        /**
         * @return 构建者
         */
        @JvmStatic
        fun with(activity: Activity): Builder = Builder(activity)

        /**
         * 调用打印log
         * */
        @JvmStatic
        fun printLog(message: String) = BuildManger.printLog(message)
    }

    /**
     * 建造者模式
     * */
    class Builder(private val activity: Activity) {

        private var config = Config(activity)

        fun setString(string: String) = apply {
            config.string = string
        }

        fun registerCallBack(listener: RequestListener.Builder.() -> Unit) = apply {
            config.callback = RequestListener().apply { registerListener(listener) }
        }

        fun create() = BuildManger.create(activity = activity, config)
    }
}