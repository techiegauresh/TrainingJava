package com.learn.entity_show.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SampleEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long uniqeId;
	
	private String entityName;

	public SampleEntity() {

	}
	
	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public long getUniqeId() {
		return uniqeId;
	}

	public void setUniqeId(long uniqeId) {
		this.uniqeId = uniqeId;
	}

	
	
}
