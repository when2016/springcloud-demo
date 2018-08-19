package com.wanghongen.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanghongen
 * @date 8/18/18 5:39 PM
 */
@RestController
public class TestEurekaController {

  @RequestMapping("/eureka")
  public String eureka() {
    return "hello eureka";
  }

}
