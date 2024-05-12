package com.techendear.app.model

import com.techendear.app.constant.RestMethod
import com.techendear.app.dto.Audit
import com.techendear.app.dto.JsonRequest
import com.techendear.app.dto.JsonResponse
import org.springframework.data.annotation.Id

data class Json(

    @Id
    val id: String,
    val uri: String,
    val method: RestMethod,
    val description: String,
    val queryParams: Set<String>?,
    val pathParams: Set<String>?,
    val jsonRequest: JsonRequest?,
    val jsonResponse: JsonResponse?,
    val audit: Audit?
)
