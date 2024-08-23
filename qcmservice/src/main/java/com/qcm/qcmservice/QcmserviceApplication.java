package com.qcm.qcmservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class QcmserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(QcmserviceApplication.class, args);
    }

}
