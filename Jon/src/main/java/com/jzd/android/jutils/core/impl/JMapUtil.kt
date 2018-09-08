package com.jzd.android.jutils.core.impl

import com.jzd.android.jutils.core.bean.JMap

/**
 * 将Any转换成JMap
 */
fun Any.toJMap(): JMapImpl
{
    return this as? JMapImpl ?: JMap("", this)
}