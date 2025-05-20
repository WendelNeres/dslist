package com.example.dslist.domain.services;


import com.example.dslist.api.DTO.GameMinDTO;
import com.example.dslist.domain.entities.Game;
import com.example.dslist.repositories.GameRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){

        return gameRepository.findAll()
                .stream().map(GameMinDTO::new)
                .collect(Collectors.toList());
    }

}
