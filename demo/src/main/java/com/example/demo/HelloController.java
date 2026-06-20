package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    
@GetMapping("hello")
public String hello()
{
    return "<h1>hello</h1>";
}

@GetMapping("/order")
public String order() {
    return "order is place";


}
@GetMapping("/payment")
public String payment() {
    return "order is place";


}



}