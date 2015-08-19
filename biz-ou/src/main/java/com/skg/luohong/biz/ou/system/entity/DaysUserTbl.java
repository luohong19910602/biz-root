package com.skg.luohong.biz.ou.system.entity;

import java.util.Date;
import com.skg.luohong.base.db.dao.AbstractPo;

/**
 *
 * @author 骆宏
 * @date 2015-08-20 01:12:09
 * @author 846705189@qq.com
 * @author 15013336884
 * @blog http://blog.csdn.net/u010469003
 * */
public class DaysUserTbl extends AbstractPo<Integer>{
    
    private String nickname;
    private Integer state;
    private Integer id;
    private String name;
    private Date createTime;
    private Integer createByWhoIsTheFucker;
    
    public void setNickname(String nickname){
        this.nickname = nickname;
    }
        
    public String getNickname(){
        return nickname;
    }
    public void setState(Integer state){
        this.state = state;
    }
        
    public Integer getState(){
        return state;
    }
    public void setId(Integer id){
        this.id = id;
    }
        
    public Integer getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
        
    public String getName(){
        return name;
    }
    public void setCreateTime(Date createTime){
        this.createTime = createTime;
    }
        
    public Date getCreateTime(){
        return createTime;
    }
    public void setCreateByWhoIsTheFucker(Integer createByWhoIsTheFucker){
        this.createByWhoIsTheFucker = createByWhoIsTheFucker;
    }
        
    public Integer getCreateByWhoIsTheFucker(){
        return createByWhoIsTheFucker;
    }
}