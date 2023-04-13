package com.mediasoft.demok8s.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FooController {
    private final FooRepository fooRepository;

    @GetMapping("/foo")
    public Foo healthCheck(@RequestParam("content") String content) {
        System.out.println("request");
        return fooRepository.save(Foo.builder()
                .content(content)
                .build());
    }
}
