package com.ruoyi.domain;

import java.util.Date;


public class MyOrder {

    private Date node_time;//收获时间
    private String node_desc;//收获地址
    public void setNode_time(Date node_time) {
        this.node_time = node_time;
    }
    public Date getNode_time() {
        return node_time;
    }

    public void setNode_desc(String node_desc) {
        this.node_desc = node_desc;
    }
    public String getNode_desc() {
        return node_desc;
    }

}