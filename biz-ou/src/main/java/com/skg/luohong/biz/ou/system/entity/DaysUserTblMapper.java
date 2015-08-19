package com.skg.luohong.biz.ou.system.entity;

import java.util.List;
import com.skg.luohong.base.db.dao.IMapper;

/**
 *
 * @author 骆宏
 * @date 2015-08-20 01:12:09
 * @author 846705189@qq.com
 * @author 15013336884
 * @blog http://blog.csdn.net/u010469003
 * */
public interface DaysUserTblMapper extends IMapper<Integer, DaysUserPo>{
    public List<DaysUserPo> findAll();
    public void update(DaysUserPo daysUserTbl);
    public void insert(DaysUserPo daysUserTbl);
    public void delete(String id);
}