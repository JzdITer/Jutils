package com.jzd.jutils.app.module.main.ui

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.view.View
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.jzd.android.jon.app.adapter.ModuleAdapter
import com.jzd.jutils.app.R
import com.jzd.jutils.app.common.bean.ModuleBean
import com.jzd.jutils.app.module.loader.ui.JLoaderActivity
import com.jzd.jutils.app.module.notification.ui.NotificationWatchActivity
import com.jzd.jutils.app.module.permission.PermissionActivity
import com.jzd.jutils.app.module.recyclerview.ui.RecyclerViewActivity
import com.jzd.jutils.app.module.rx.ui.RxMainActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{

    private val mLayoutManager = GridLayoutManager(this, 2)
    private val mAdapter = ModuleAdapter(R.layout.rv_item_main_module, null)
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)

        mRvTest.layoutManager = mLayoutManager
        mRvTest.adapter = mAdapter

        initData()

        mAdapter.setOnItemClickListener({ baseQuickAdapter: BaseQuickAdapter<Any, BaseViewHolder>, _: View, i: Int ->
            val moduleBean = baseQuickAdapter.getItem(i) as ModuleBean
            if (moduleBean.target != null)
            {
                startActivity(Intent(this, moduleBean.target))
            }
        })

    }

    private fun initData()
    {
        val data = arrayListOf<ModuleBean>()
        data.add(ModuleBean("权限管理", PermissionActivity::class.java))
        data.add(ModuleBean("RxJava", RxMainActivity::class.java))
        data.add(ModuleBean("RecyclerView", RecyclerViewActivity::class.java))
        data.add(ModuleBean("JLoader", JLoaderActivity::class.java))
        data.add(ModuleBean("Notification", NotificationWatchActivity::class.java))
        mAdapter.setNewData(data)
    }
}
