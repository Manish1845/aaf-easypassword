package io.github.hanjoongcho.easypassword.activities

import android.view.ViewGroup
import io.github.hanjoongcho.commons.activities.BaseCustomizationActivity
import io.github.hanjoongcho.easypassword.R
import io.github.hanjoongcho.easypassword.extensions.pausePatternLock
import io.github.hanjoongcho.easypassword.extensions.resumePatternLock
import io.github.hanjoongcho.easypassword.helper.APP_BACKGROUND_ALPHA

/**
 * Created by CHO HANJOONG on 2018-01-20.
 */

class CustomizationActivity : BaseCustomizationActivity() {
    override fun onPause() {
        super.onPause()
        pausePatternLock()
    }

    override fun onResume() {
        isBackgroundColorFromPrimaryColor = true
        super.onResume()
        resumePatternLock()
    }

    override fun getMainViewGroup(): ViewGroup? = findViewById(R.id.main_holder)
    override fun getBackgroundAlpha(): Int = APP_BACKGROUND_ALPHA
}