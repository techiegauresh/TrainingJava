package com.learn.entity_show.service;

import java.util.List;

import com.learn.entity_show.entity.SampleEntity;

public interface EntityService {

	public List<SampleEntity> getSampleEntities();
	
	public Long addSampleEntity(SampleEntity entity);
}
