package com.autentia.spring.cloud.netflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ApplicationPublicRestService {

  public static void main(String[] args) {
    SpringApplication.run(ApplicationPublicRestService.class, args);
  }
}