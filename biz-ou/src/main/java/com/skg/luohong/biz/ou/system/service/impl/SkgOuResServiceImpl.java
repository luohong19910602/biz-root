package com.skg.luohong.biz.ou.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skg.luohong.biz.ou.system.dao.ISkgOuResDao;
import com.skg.luohong.biz.ou.system.entity.SkgOuResEntity;
import com.skg.luohong.biz.ou.system.service.ISkgOuResService;

@Service
public class SkgOuResServiceImpl implements ISkgOuResService {
    
	@Autowired
	private ISkgOuResDao dao;
	
	public void add(SkgOuResEntity entity) {
		dao.add(entity);
	}

	public void update(SkgOuResEntity entity) {
		dao.update(entity);
	}

	public void delete(String id) {
		dao.delete(id);
	}

	public List<SkgOuResEntity> findAll() {
		return dao.findAll();
	}
   
    
}
