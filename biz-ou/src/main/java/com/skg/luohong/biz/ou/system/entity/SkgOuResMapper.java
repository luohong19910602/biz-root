package com.skg.luohong.biz.ou.system.entity;

import java.util.List;

/**
 *
 * @author 骆宏
 * @date 2015-08-19 12:35:59
 * @author 846705189@qq.com
 * @author 15013336884
 * @blog http://blog.csdn.net/u010469003
 * */
public interface SkgOuResMapper{
    public List<SkgOuResEntity> findAll();
    public void update(SkgOuResEntity skgOuResEntity);
    public void insert(SkgOuResEntity skgOuResEntity);
    public void delete(String id);
}