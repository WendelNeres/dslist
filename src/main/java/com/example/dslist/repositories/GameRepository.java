package com.example.dslist.repositories;

import com.example.dslist.domain.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {


}
