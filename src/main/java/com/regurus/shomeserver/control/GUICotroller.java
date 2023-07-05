package com.regurus.shomeserver.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GUICotroller {
    @GetMapping("/hello")
    String hello() {
      return "Hello World";
    }
}
