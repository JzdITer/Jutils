package com.jzd.jutils.app.bean

import com.jzd.android.jutils.core.bean.JMap

data class MapBean(val key: String, val value: String) : JMap() {
    override fun key(): Any {
        return key
    }

    override fun value(): Any {
        return value
    }
}