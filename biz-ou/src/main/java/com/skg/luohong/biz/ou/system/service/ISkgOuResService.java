package com.skg.luohong.biz.ou.system.service;

import java.util.List;

import com.skg.luohong.biz.ou.system.entity.SkgOuResEntity;

/**
 * @Author 骆宏
 * @Date 2015-08-19 12:35:59
 */
public interface ISkgOuResService {
	public void add(SkgOuResEntity entity);
    public void update(SkgOuResEntity entity);
    public void delete(String id);
    public List<SkgOuResEntity> findAll();
}