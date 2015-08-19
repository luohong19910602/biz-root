package com.skg.luohong.biz.ou.system.entity;

import java.util.Date;

/**
 *
 * @author 骆宏
 * @date 2015-08-19 12:35:59
 * @author 846705189@qq.com
 * @author 15013336884
 * @blog http://blog.csdn.net/u010469003
 * */
public class SkgOuResEntity{
    
    private String id;
    private String subsysId;
    private String name;
    private String type;
    private String content;
    private String parentId;
    private String path;
    private int depth;
    private String icon;
    private String isActived;
    private int sort;
    private String belong;
    
    public void setId_(String id){
        this.id = id;
    }
        
    public String getId_(){
        return id;
    }
    public void setSubsys_id_(String subsysId){
        this.subsysId = subsysId;
    }
        
    public String getSubsys_id_(){
        return subsysId;
    }
    public void setName_(String name){
        this.name = name;
    }
        
    public String getName_(){
        return name;
    }
    public void setType_(String type){
        this.type = type;
    }
        
    public String getType_(){
        return type;
    }
    public void setContent_(String content){
        this.content = content;
    }
        
    public String getContent_(){
        return content;
    }
    public void setParent_id_(String parentId){
        this.parentId = parentId;
    }
        
    public String getParent_id_(){
        return parentId;
    }
    public void setPath_(String path){
        this.path = path;
    }
        
    public String getPath_(){
        return path;
    }
    public void setDepth_(int depth){
        this.depth = depth;
    }
        
    public int getDepth_(){
        return depth;
    }
    public void setIcon_(String icon){
        this.icon = icon;
    }
        
    public String getIcon_(){
        return icon;
    }
    public void setIs_actived_(String isActived){
        this.isActived = isActived;
    }
        
    public String getIs_actived_(){
        return isActived;
    }
    public void setSort_(int sort){
        this.sort = sort;
    }
        
    public int getSort_(){
        return sort;
    }
    public void setBelong_(String belong){
        this.belong = belong;
    }
        
    public String getBelong_(){
        return belong;
    }
}