package com.ruoyi.domain;

import java.util.List;
import java.util.Date;

public class Result {

    private String Express_Num;//快递单号
    private String Express_Name;//快递公司名称代码
    private List<List> list;
    private String Now_Status;//签收状态
    private String ExpressName;//签收公司
    private String ExpressWeb;//快递公司官网
    private String ExpressPhone;//快递公司客服电话
    private String LastCourier;//快递员
    private String courierPhone;//快递员手机
    private Date LastTime;//查询时间
    private String SpeedTime;//配送总共时间
    public void setExpress_Num(String Express_Num) {
        this.Express_Num = Express_Num;
    }
    public String getExpress_Num() {
        return Express_Num;
    }

    public void setExpress_Name(String Express_Name) {
        this.Express_Name = Express_Name;
    }
    public String getExpress_Name() {
        return Express_Name;
    }

    public void setList(List<List> list) {
        this.list = list;
    }
    public List<List> getList() {
        return list;
    }

    public void setNow_Status(String Now_Status) {
        this.Now_Status = Now_Status;
    }
    public String getNow_Status() {
        return Now_Status;
    }

    public void setExpressName(String ExpressName) {
        this.ExpressName = ExpressName;
    }
    public String getExpressName() {
        return ExpressName;
    }

    public void setExpressWeb(String ExpressWeb) {
        this.ExpressWeb = ExpressWeb;
    }
    public String getExpressWeb() {
        return ExpressWeb;
    }

    public void setExpressPhone(String ExpressPhone) {
        this.ExpressPhone = ExpressPhone;
    }
    public String getExpressPhone() {
        return ExpressPhone;
    }

    public void setLastCourier(String LastCourier) {
        this.LastCourier = LastCourier;
    }
    public String getLastCourier() {
        return LastCourier;
    }

    public void setCourierPhone(String courierPhone) {
        this.courierPhone = courierPhone;
    }
    public String getCourierPhone() {
        return courierPhone;
    }

    public void setLastTime(Date LastTime) {
        this.LastTime = LastTime;
    }
    public Date getLastTime() {
        return LastTime;
    }

    public void setSpeedTime(String SpeedTime) {
        this.SpeedTime = SpeedTime;
    }
    public String getSpeedTime() {
        return SpeedTime;
    }

}