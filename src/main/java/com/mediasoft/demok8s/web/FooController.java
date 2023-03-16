package com.mediasoft.demok8s.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

    @Value("${app.fooMsg}")
    private String msg;

    @GetMapping("/foo")
    public Foo healthCheck() {
        System.out.println("request");
        return Foo.builder()
                .status(Foo.Status.OK)
                .msg(this.msg)
                .build();
    }
}
