package com.techendear.app.constant

enum class RestMethod(val value: String) {
    GET("GET"), POST("POST"), PUT("PUT"), PATCH("PATCH"),
    DELETE("DELETE"), HEAD("HEAD"), OPTIONS("OPTIONS"),
    TRACE("TRACE"), CONNECT("CONNECT")
}