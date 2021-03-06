package org.fattili.easypopup.view.pop

import android.app.Activity
import android.view.Gravity
import org.fattili.easypopup.R
import org.fattili.easypopup.view.EasyPop

/**
 * 2021/2/22
 * 左侧弹出窗
 * @author dengzhenli
 */
abstract class LeftPop : EasyPop {
    constructor(activity: Activity) : super(activity) {
        setGravity(Gravity.LEFT)
        setAnimationStyle(R.style.ep_common_pop_left_theme)
    }
}