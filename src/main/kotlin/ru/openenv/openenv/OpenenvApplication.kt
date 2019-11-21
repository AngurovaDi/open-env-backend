package ru.openenv.openenv

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OpenenvApplication

fun main(args: Array<String>) {
	runApplication<OpenenvApplication>(*args)
}
