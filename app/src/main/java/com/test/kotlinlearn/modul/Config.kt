package com.test.kotlinlearn.modul

import android.content.Context
import com.test.kotlinlearn.utils.RequestListener

/**
 *
 *@author lidexin
 *@email tuz1425@dingtalk.com
 *@date 2021/6/29
 */
data class Config(private val context: Context){

    var string: String? = null

    var callback: RequestListener? = null
}
