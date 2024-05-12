package com.techendear.app.dto

import java.time.LocalDateTime

data class Audit(
    val createdBy: String,
    val createdAt: LocalDateTime,
    val updatedBy: String,
    val updateAt: LocalDateTime
)
