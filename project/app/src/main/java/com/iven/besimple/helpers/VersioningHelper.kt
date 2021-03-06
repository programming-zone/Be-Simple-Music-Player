package com.iven.besimple.helpers

import android.os.Build

object VersioningHelper {
    @JvmStatic
    fun isQ() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q

    @JvmStatic
    fun isMarshMallow() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.M

    @JvmStatic
    fun isNougat() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.N

    @JvmStatic
    fun isOreo() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.O

    @JvmStatic
    fun isOreoMR1() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.O_MR1
}
