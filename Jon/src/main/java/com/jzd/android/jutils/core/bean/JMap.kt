package com.jzd.android.jutils.core.bean

import com.jzd.android.jutils.core.interf.JMapInter

/**
 * JMapInter子类,可以不用实现obj()方法,在只使用Key-Value功能的情况下继承该类
 *
 * @author jzd
 * @since  v1.0
 */
abstract class JMap : JMapInter {

    override fun obj(): Any? {
        return this
    }
}