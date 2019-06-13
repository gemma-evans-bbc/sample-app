package uk.co.bbc.sampleapp.homeview

import androidx.core.view.AccessibilityDelegateCompat
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat


class HeadingAccessibilityDelegate(private val rowIndex : Int) : AccessibilityDelegateCompat() {


    override fun onInitializeAccessibilityNodeInfo(
        host: android.view.View?,
        info: AccessibilityNodeInfoCompat?
    ) {
        super.onInitializeAccessibilityNodeInfo(host, info)
        info?.let {
                it.isHeading = true
            }
    }


}

