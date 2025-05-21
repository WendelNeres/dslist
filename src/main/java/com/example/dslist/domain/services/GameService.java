package com.example.dslist.domain.services;


import com.example.dslist.api.DTO.GameDTO;
import com.example.dslist.api.DTO.GameMinDTO;
import com.example.dslist.domain.entities.Game;
import com.example.dslist.repositories.GameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        return gameRepository.findAll()
                .stream().map(GameMinDTO::new)
                .collect(Collectors.toList());
    }


    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
       Game game = gameRepository.findById(id).get();

       if(game != null){
           return new GameDTO(game);
       }else throw new RuntimeException("Game não encontrado");





    }

}
