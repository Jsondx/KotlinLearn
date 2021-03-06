package com.test.kotlinlearn.utils

/**
 *登录成功失败接口
 *@author lidexin
 *@email tuz1425@dingtalk.com
 *@date 2021/6/28
 */
class RequestListener {

    lateinit var builder: Builder

    /** 带Builder返回值的lambda */
    fun registerListener(builder: Builder.() -> Unit) {
        this.builder = Builder().also(builder)
    }

    inner class Builder {
        internal var success: ((String) -> Unit)? = null
        internal var error: ((Int,String) -> Unit)? = null
        /** 成功 */
        fun success(action: (String) -> Unit) {
            success = action
        }
        /** 失败 */
        fun error(action: (Int,String) -> Unit) {
            error = action
        }
    }
}