package com.wanghongen.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanghongen
 * @date 8/18/18 5:21 PM
 */
@RestController
@RequestMapping("/test/")
public class HelloController {

  @RequestMapping("hello")
  public String getHello(){
    System.out.println("hello world");
    return "hello world";
  }

}
