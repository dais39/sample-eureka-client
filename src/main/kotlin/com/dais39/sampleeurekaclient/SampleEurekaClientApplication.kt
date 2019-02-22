package com.dais39.sampleeurekaclient

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class SampleEurekaClientApplication

fun main(args: Array<String>) {
    runApplication<SampleEurekaClientApplication>(*args)
}
