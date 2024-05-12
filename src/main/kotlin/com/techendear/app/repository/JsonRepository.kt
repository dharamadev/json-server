package com.techendear.app.repository

import com.techendear.app.constant.RestMethod
import com.techendear.app.model.Json
import org.springframework.data.mongodb.repository.MongoRepository

interface JsonRepository : MongoRepository<Json, String> {
    fun findByUri(uri: String): Set<Json>
    fun findByUriAndMethod(uri: String, method: RestMethod): Json
}