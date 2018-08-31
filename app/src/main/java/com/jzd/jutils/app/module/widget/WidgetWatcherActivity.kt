package com.jzd.jutils.app.module.widget

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.jzd.android.jutils.app.adapter.ModuleAdapter
import com.jzd.jutils.app.R
import com.jzd.jutils.app.common.bean.ModuleBean
import kotlinx.android.synthetic.main.activity_widget_watcher.*

class WidgetWatcherActivity : AppCompatActivity()
{

    private val mModules = arrayListOf<ModuleBean>();
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_widget_watcher)

        mRvData.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        mModules.add(ModuleBean("JToast"))

        val mAdapter = ModuleAdapter(R.layout.rv_item_main_module, mModules)
        mRvData.adapter = mAdapter
        mAdapter.setOnItemClickListener({ adapter, _, position ->
            val item = adapter.getItem(position) as ModuleBean
        })
    }
}
