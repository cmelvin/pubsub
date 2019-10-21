package com.pubsub.pub.pub;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublisherController {

    @GetMapping("/publish")
    public String publishXML(){
        return "max:99/min:9";
    }
}
