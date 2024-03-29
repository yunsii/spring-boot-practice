package top.theprimone.springbootpractice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @Value("${admin.name}")
  public String adminName;

  @RequestMapping(value = "/hello", method = RequestMethod.GET)
  public String hello() {
    return String.format("Hello, %s!", adminName);
  }
  
}
