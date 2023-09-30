package com.sachet.cicd.controller;

import com.sachet.cicd.service.IntroService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/intro")
public class IntroController {

    private final IntroService introService;

    public IntroController(IntroService introService) {
        this.introService = introService;
    }

    @GetMapping("")
    public ResponseEntity<String> getIntro() {
        return ResponseEntity.ok(introService.getMessage());
    }

}
