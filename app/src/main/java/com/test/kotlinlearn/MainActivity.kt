package com.test.kotlinlearn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.test.kotlinlearn.utils.BuildUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //建造者
        BuildUtils.with(this).setString("a").registerCallBack {
            success {
                Log.e("TAG","it=$it")
            }
            error { i, s ->
                Log.e("TAG","i=$i  s=$s")
            }
        }.create()

        BuildUtils.printLog("我草")



    }
}