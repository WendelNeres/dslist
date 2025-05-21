package com.example.dslist.api.controllers;


import com.example.dslist.api.DTO.GameListDTO;
import com.example.dslist.domain.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    private GameListService service;

    @GetMapping
    public ResponseEntity<List<GameListDTO>> findAll(){
        return new ResponseEntity<List<GameListDTO>>(service.findAll(), HttpStatus.OK);
    }





}
