package com.mionix.baseapp.base


import java.io.Serializable
import java.lang.RuntimeException

data class ResponseError(
    val code: Int,
    val msg: String
) : RuntimeException(), Serializable