package com.skg.luohong.biz.ou.system.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.skg.luohong.biz.ou.system.dao.ISkgOuResDao;
import com.skg.luohong.biz.ou.system.entity.SkgOuResEntity;
import com.skg.luohong.biz.ou.system.entity.SkgOuResMapper;

@Repository
public class SkgOuResDaoImpl implements ISkgOuResDao {
	@Autowired
	private SkgOuResMapper mapper;
	
	public SkgOuResDaoImpl(){
		System.out.println("init dao impl");
	}
	
	public void add(SkgOuResEntity entity) {
	    mapper.insert(entity);
	}

	public void update(SkgOuResEntity entity) {
		mapper.update(entity);
	}

	public void delete(String id) {
		mapper.delete(id);
	}

	public List<SkgOuResEntity> findAll() {
		return mapper.findAll();
	}
}