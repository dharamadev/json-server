package com.techendear.app.service

import com.techendear.app.model.Json

interface JsonService {
    fun createJsonRequest(json: Json): Json
    fun getJsonRequestBUriAndCode(uri: String, code: String): Json
    fun getJsonRequestByUri(uri: String, code: String): Json
    fun updateJsonRequest(uri: String, code: String, json: Json): Json
    fun deleteJsonRequest(uri: String, code: String)
}