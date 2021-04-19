package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {

    @PostMapping("/get_json")
    public Product getJson(@RequestBody Product product){
        product.getInfo().setId(123);
        return product;
    }

}
