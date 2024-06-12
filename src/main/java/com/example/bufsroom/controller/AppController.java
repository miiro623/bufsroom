package com.example.bufsroom.controller;

import com.example.bufsroom.dto.AppCreateForm;
import com.example.bufsroom.service.AppService;
import com.example.bufsroom.user.AppForm;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;



@RequiredArgsConstructor
@RestController
@RequestMapping("/app")
public class AppController {

    private final AppService appService;



    @PostMapping("/form")
    public ResponseEntity<AppForm> createApp(@RequestBody AppCreateForm request) {

            AppForm savedAppForm = appService.createApp(request);

            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(savedAppForm);
    }

}