package com.example.dslist.api.controllers;


import com.example.dslist.api.DTO.GameMinDTO;
import com.example.dslist.domain.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService service;

    @GetMapping
    public ResponseEntity<List<GameMinDTO>> findAll(){
        return new ResponseEntity<List<GameMinDTO>>(service.findAll(), HttpStatus.OK);
    }


}
