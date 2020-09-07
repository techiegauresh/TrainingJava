package com.learn.entity_show.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.entity_show.entity.SampleEntity;
import com.learn.entity_show.repository.EntityRepository;
import com.learn.entity_show.service.EntityService;

@Service
public class EntityServiceImpl implements EntityService{

	@Autowired
	private EntityRepository entityRepository;
	
	public List<SampleEntity> getSampleEntities(){
		return (List<SampleEntity>) entityRepository.findAll();
	}
	
	public Long addSampleEntity(SampleEntity entity) {
		entityRepository.save(entity);
		return entity.getUniqeId();
	}
}
