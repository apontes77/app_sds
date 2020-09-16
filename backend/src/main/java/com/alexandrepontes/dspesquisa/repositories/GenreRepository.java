package com.alexandrepontes.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alexandrepontes.dspesquisa.entities.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Long, Genre>{

}
