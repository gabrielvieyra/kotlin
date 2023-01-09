package com.example.login_jetpack_compose.screens

import androidx.annotation.RawRes
import com.example.login_jetpack_compose.R

class SvgAnimationsData(@RawRes val resId: Int, val title: String)

val listData = listOf(
    SvgAnimationsData(
        R.raw.mobile_banking,
        "Animation 01"
    ),
    SvgAnimationsData(
        R.raw.mobile_banking02,
        "Animation 02"
    ),
    SvgAnimationsData(
        R.raw.mobile_banking03,
        "Animation 03"
    )
)