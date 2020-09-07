package com.learn.entity_show.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learn.entity_show.entity.SampleEntity;
import com.learn.entity_show.service.EntityService;

@RestController
public class EntityController {

	@Autowired
	private EntityService entityService;
	
	@GetMapping("/entities")
	public List<SampleEntity> getSampleEntities(){
		return entityService.getSampleEntities();
	}
	
	@PostMapping("/entity/add")
	public Long addSampleEntity(@RequestBody SampleEntity entity) {
		return entityService.addSampleEntity(entity);
	}
}
