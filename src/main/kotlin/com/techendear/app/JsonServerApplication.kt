package com.techendear.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JsonServerApplication

fun main(args: Array<String>) {
	runApplication<JsonServerApplication>(*args)
}
