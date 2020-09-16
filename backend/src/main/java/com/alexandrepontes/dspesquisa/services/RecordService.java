package com.alexandrepontes.dspesquisa.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alexandrepontes.dspesquisa.dto.RecordDTO;
import com.alexandrepontes.dspesquisa.dto.RecordInsertDTO;
import com.alexandrepontes.dspesquisa.entities.Game;
import com.alexandrepontes.dspesquisa.entities.Record;
import com.alexandrepontes.dspesquisa.repositories.GameRepository;
import com.alexandrepontes.dspesquisa.repositories.RecordRepository;

@Service
public class RecordService {
	
	@Autowired
	private RecordRepository recordRepository;
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional
	public RecordDTO insert (RecordInsertDTO dto) {
		Record entity = new Record();
		
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());
		
		Game game = gameRepository.getOne(dto.getGameId());
		entity.setGame(game);
		
		entity = recordRepository.save(entity);
		
		return new RecordDTO(entity);
	}
}
