package com.jzd.android.jutils.utils

/**
 * 检查
 * @author Jzd
 * @since 1.0
 */
class JChecker
{
    /**
     * 是否包含中文字符
     */
    fun isContainChinese(char: Char?): Boolean
    {
        if (char == null)
        {
            return false
        }
        val ub = Character.UnicodeBlock.of(char)
        return (ub === Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS
                || ub === Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
                || ub === Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A
                || ub === Character.UnicodeBlock.GENERAL_PUNCTUATION
                || ub === Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION
                || ub === Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS)
    }
}