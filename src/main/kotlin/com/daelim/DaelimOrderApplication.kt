package com.daelim

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DaelimOrderApplication

fun main(args: Array<String>) {
	runApplication<DaelimOrderApplication>(*args)
}
