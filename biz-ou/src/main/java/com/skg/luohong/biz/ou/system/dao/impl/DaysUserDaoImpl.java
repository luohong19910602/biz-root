package com.skg.luohong.biz.ou.system.dao.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.skg.luohong.biz.ou.system.dao.IDaysUserDao;
import com.skg.luohong.biz.ou.system.entity.DaysUserPo;
import com.skg.luohong.base.db.dao.mybatis.AbstractDao;
import com.skg.luohong.base.db.dao.IMapper;

@Repository
public class DaysUserDaoImpl extends AbstractDao<Integer, DaysUserPo> implements IDaysUserDao{
	@Autowired
	private IMapper<Integer, DaysUserPo> mapper;
	
	public IMapper<Integer, DaysUserPo> getMapper(){
	    return mapper;
	}
	
}