package com.example.uyangi.intro

import android.graphics.Typeface
import android.view.Gravity
import android.view.View
import com.example.uyangi.R
import org.jetbrains.anko.*

class IntroActivityUI : AnkoComponent<IntroActivity> {

    override fun createView(ui: AnkoContext<IntroActivity>): View {
        return ui.relativeLayout {
            gravity = Gravity.CENTER

            // UYANGI라는 텍스트 출력
            textView("UYANGI") {
                textSize = 24f
                textColorResource = R.color.colorPrimary
                typeface = Typeface.DEFAULT_BOLD
            }
        }
    }

}