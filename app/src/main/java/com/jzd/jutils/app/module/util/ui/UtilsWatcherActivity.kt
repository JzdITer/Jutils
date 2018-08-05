package com.jzd.jutils.app.module.util.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import com.chad.library.adapter.base.BaseQuickAdapter
import com.jzd.android.jutils.app.adapter.MainAdapter
import com.jzd.android.jutils.app.bean.ModuleBean
import com.jzd.android.jutils.utils.JMetricsUtil
import com.jzd.jutils.app.R
import kotlinx.android.synthetic.main.activity_utils_watcher.*

class UtilsWatcherActivity : AppCompatActivity() {

    private val mModules = arrayListOf<ModuleBean>();
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_utils_watcher)

        mRvData.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)


        mModules.add(ModuleBean("JMetricsUtil"))

        val mAdapter = MainAdapter(R.layout.rv_item_main_module, mModules)
        mRvData.adapter = mAdapter
        mAdapter.setOnItemClickListener({ adapter, _, position ->
            val item = adapter.getItem(position) as ModuleBean
            if (item.title == "JMetricsUtil") {
                Log.d("tag", JMetricsUtil.getDensityDpi(context = this).toString())
            }
        })
    }
}
