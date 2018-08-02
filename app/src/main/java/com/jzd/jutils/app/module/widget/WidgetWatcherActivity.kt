package com.jzd.jutils.app.module.widget

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.jzd.android.jutils.core.bean.JMap
import com.jzd.jutils.app.R
import com.jzd.jutils.app.bean.MapBean
import kotlinx.android.synthetic.main.activity_widget_watcher.*

class WidgetWatcherActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_widget_watcher)


        val jMapInter = MapBean("1","我是1")

        mItem.setData(jMapInter)

    }
}
