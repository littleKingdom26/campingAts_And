package kr.co.campingats_and.intro

import android.graphics.Typeface
import android.view.Gravity
import android.view.View
import kr.co.campingats_and.R
import org.jetbrains.anko.*

class IntroActivityUI:AnkoComponent<IntroActivity> {

    override fun createView(ui: AnkoContext<IntroActivity>): View {
        return ui.relativeLayout {
            gravity = Gravity.CENTER

            textView(R.string.app_name){
                textSize = 24f
                textColorResource = R.color.black
                typeface = Typeface.DEFAULT_BOLD
            }
        }
    }
}