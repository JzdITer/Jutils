package com.jzd.jutils.app.module.util.toast

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.jzd.jutils.app.R
import kotlinx.android.synthetic.main.activity_toast_watcher.*

class ToastWatcherActivity : AppCompatActivity(), View.OnClickListener
{
    override fun onClick(v: View?)
    {
        when (v?.id)
        {
            R.id.mBtn1 ->{
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast_watcher)

        mBtn1.setOnClickListener(this)
    }
}
