package com.alexandrepontes.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alexandrepontes.dspesquisa.entities.Game;
@Repository
public interface GameRepository extends JpaRepository<Long, Game>{

}
