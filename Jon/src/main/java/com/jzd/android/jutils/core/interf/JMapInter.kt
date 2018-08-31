package com.jzd.android.jutils.core.interf

/**
 * 键值对,实现该接口,可快速转换Key-Value形式
 *
 * @author jzd
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