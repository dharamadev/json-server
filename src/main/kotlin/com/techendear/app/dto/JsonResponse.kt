package com.techendear.app.dto

data class JsonResponse(
    val code: Int,
    val metaData: Map<String, Any>?,
    val jsonResponse: Map<String, Any>?
)
