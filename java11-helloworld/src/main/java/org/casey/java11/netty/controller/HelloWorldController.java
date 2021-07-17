package org.casey.java11.netty.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author Fu Kai
 * @since 20210717
 */

@RestController
public class HelloWorldController {

    @GetMapping
    public Map<String, Object> helloworld() {
        return Map.of("data", "hello world", "msg", "success");
    }
}
