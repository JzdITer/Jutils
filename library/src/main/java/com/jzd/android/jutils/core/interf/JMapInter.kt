package com.jzd.android.jutils.core.interf

/**
 * 键值对,实现该接口,可快速转换Key-Value形式
 *
 * @author jzd
 * @date   2018/8/2 23:20
 * @email  jzd_dev1@163.com
 * @since  v1.0
 */

interface JMapInter {
    /**
     * 返回Key
     */
    fun key(): Any

    /**
     * 返回Value
     */
    fun value(): Any

    /**
     * 返回本身
     */
    fun obj(): Any?
}