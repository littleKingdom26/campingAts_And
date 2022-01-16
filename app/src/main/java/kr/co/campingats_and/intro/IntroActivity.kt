package kr.co.campingats_and.intro

import android.app.Activity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.runBlocking
import kr.co.campingats_and.api.CodeApi
import org.jetbrains.anko.setContentView
import java.lang.Exception

class IntroActivity : Activity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val ui = IntroActivityUI()
        ui.setContentView(this)

        runBlocking {
            try{
                val response = CodeApi.instance.scale()
                response.data?.let { Log.d("IntroActivity", it) }
            } catch (e:Exception){
                Log.e("IntroActivity","scaleApi 에러", e)
            }
        }
    }
}