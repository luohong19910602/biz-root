package com.skg.luohong.biz.ou.system.service;

import java.util.List;

import com.skg.luohong.biz.ou.system.entity.DaysUserPo;

/**
 * @Author 骆宏
 * @Date 2015-08-20 01:12:08
 */
public interface IDaysUserService {
	public void add(DaysUserPo entity);
    public void update(DaysUserPo entity);
    public void delete(Integer id);
    public List<DaysUserPo> findAll();
}