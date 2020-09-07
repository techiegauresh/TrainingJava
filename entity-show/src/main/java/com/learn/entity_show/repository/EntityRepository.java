package com.learn.entity_show.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.learn.entity_show.entity.SampleEntity;

@Repository
public interface EntityRepository extends CrudRepository<SampleEntity, Long> {

}
