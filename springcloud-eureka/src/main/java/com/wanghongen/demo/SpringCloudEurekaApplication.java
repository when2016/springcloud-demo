package com.wanghongen.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author wanghongen
 * @date 8/18/18 2:58 PM
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringCloudEurekaApplication.class, args);
  }
}