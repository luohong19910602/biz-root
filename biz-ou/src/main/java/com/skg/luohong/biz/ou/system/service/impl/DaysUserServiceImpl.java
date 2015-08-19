package com.skg.luohong.biz.ou.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skg.luohong.biz.ou.system.dao.IDaysUserDao;
import com.skg.luohong.biz.ou.system.entity.DaysUserPo;
import com.skg.luohong.biz.ou.system.service.IDaysUserService;

@Service
public class DaysUserServiceImpl implements IDaysUserService {
    
	@Autowired
	private IDaysUserDao dao;
	
	public void add(DaysUserPo entity) {
		dao.create(entity);
	}

	public void update(DaysUserPo entity) {
		dao.update(entity);
	}

	public void delete(Integer id) {
		dao.delete(id);
	}

	public List<DaysUserPo> findAll() {
		return dao.findAll();
	}
   
    
}
