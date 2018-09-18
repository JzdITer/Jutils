package com.jzd.jutils.app.module.notification.ui

import android.os.Bundle
import com.jzd.jutils.app.R
import com.jzd.jutils.app.base.BaseActivity
import kotlinx.android.synthetic.main.activity_notification_info.*

class NotificationInfoActivity : BaseActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification_info)


        val bundleExtra = intent.getBundleExtra("bundle")
        if (bundleExtra != null)
        {
            mTvInfo.text = bundleExtra.getString("data")
        }
    }
}
