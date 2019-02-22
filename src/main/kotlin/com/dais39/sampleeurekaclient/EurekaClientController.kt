package com.dais39.aclient

import org.springframework.cloud.client.ServiceInstance
import org.springframework.cloud.client.discovery.DiscoveryClient
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
internal class EurekaClientController(private val discoveryClient: DiscoveryClient) {

    @RequestMapping("/service-instances/{applicationName}")
    fun serviceInstancesByApplicationName(
        @PathVariable applicationName: String
    ): List<ServiceInstance> {
        return this.discoveryClient.getInstances(applicationName)
    }
}
