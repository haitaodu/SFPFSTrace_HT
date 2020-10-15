package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

/**
 * @author ：tao
 * @date ：Created in 2020/9/24 14:18
 * @description：${description}
 * @modified By：
 * @version: version
 */

@Entity
@Table(name = "CL_TQOP20", schema = "core", catalog = "MESDB_SXHTDL")
public class CL_TQOP20 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private Date CREATE_DATE;
    private String IS_SYNCH;
    private String SerialNumber;
    private Integer WorkOrderId;
    private String IS_OK;
    private Integer DB196_DBW0;
    private Integer DB196_DBW12;
    private Integer DB196_DBW14;
    private Integer DB196_DBW2;
    private Integer DB196_DBW4;
    private Integer DB197_DBD308;
    private Integer DB197_DBD312;
    private Integer DB197_DBD356;
    private Integer DB197_DBD360;
    private Integer DB197_DBD404;
    private Integer DB197_DBD408;
    private Integer DB197_DBD420;
    private Integer DB197_DBD424;
    private Integer DB197_DBD436;
    private Integer DB197_DBD440;
    private Integer DB197_DBD452;
    private Integer DB197_DBD456;
    private Integer DB197_DBD468;
    private Integer DB197_DBD472;
    private Integer DB197_DBD484;
    private Integer DB197_DBD488;
    private Integer DB197_DBD548;
    private Integer DB197_DBD552;
    private Integer DB197_DBD568;
    private Integer DB197_DBD580;
    private Integer DB197_DBD584;
    private Integer IW90;
    private Integer IW92;
    private Integer IW94;
    private Integer IW96;
    private Integer IW98;
    private String MW2078;
    private Integer MW2112;
    private String MW254;
    private String MW258;
    private Integer MW294;

    public String getIS_OK() {
        return IS_OK;
    }

    public void setIS_OK(String IS_OK) {
        this.IS_OK = IS_OK;
    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public Date getCREATE_DATE() {
        return CREATE_DATE;
    }

    public void setCREATE_DATE(Date CREATE_DATE) {
        this.CREATE_DATE = CREATE_DATE;
    }

    public String getIS_SYNCH() {
        return IS_SYNCH;
    }

    public void setIS_SYNCH(String IS_SYNCH) {
        this.IS_SYNCH = IS_SYNCH;
    }

    public String getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        SerialNumber = serialNumber;
    }

    public Integer getWorkOrderId() {
        return WorkOrderId;
    }

    public void setWorkOrderId(Integer workOrderId) {
        WorkOrderId = workOrderId;
    }

    public Integer getDB196_DBW0() {
        return DB196_DBW0;
    }

    public void setDB196_DBW0(Integer DB196_DBW0) {
        this.DB196_DBW0 = DB196_DBW0;
    }

    public Integer getDB196_DBW12() {
        return DB196_DBW12;
    }

    public void setDB196_DBW12(Integer DB196_DBW12) {
        this.DB196_DBW12 = DB196_DBW12;
    }

    public Integer getDB196_DBW14() {
        return DB196_DBW14;
    }

    public void setDB196_DBW14(Integer DB196_DBW14) {
        this.DB196_DBW14 = DB196_DBW14;
    }

    public Integer getDB196_DBW2() {
        return DB196_DBW2;
    }

    public void setDB196_DBW2(Integer DB196_DBW2) {
        this.DB196_DBW2 = DB196_DBW2;
    }

    public Integer getDB196_DBW4() {
        return DB196_DBW4;
    }

    public void setDB196_DBW4(Integer DB196_DBW4) {
        this.DB196_DBW4 = DB196_DBW4;
    }

    public Integer getDB197_DBD308() {
        return DB197_DBD308;
    }

    public void setDB197_DBD308(Integer DB197_DBD308) {
        this.DB197_DBD308 = DB197_DBD308;
    }

    public Integer getDB197_DBD312() {
        return DB197_DBD312;
    }

    public void setDB197_DBD312(Integer DB197_DBD312) {
        this.DB197_DBD312 = DB197_DBD312;
    }

    public Integer getDB197_DBD356() {
        return DB197_DBD356;
    }

    public void setDB197_DBD356(Integer DB197_DBD356) {
        this.DB197_DBD356 = DB197_DBD356;
    }

    public Integer getDB197_DBD360() {
        return DB197_DBD360;
    }

    public void setDB197_DBD360(Integer DB197_DBD360) {
        this.DB197_DBD360 = DB197_DBD360;
    }

    public Integer getDB197_DBD404() {
        return DB197_DBD404;
    }

    public void setDB197_DBD404(Integer DB197_DBD404) {
        this.DB197_DBD404 = DB197_DBD404;
    }

    public Integer getDB197_DBD408() {
        return DB197_DBD408;
    }

    public void setDB197_DBD408(Integer DB197_DBD408) {
        this.DB197_DBD408 = DB197_DBD408;
    }

    public Integer getDB197_DBD420() {
        return DB197_DBD420;
    }

    public void setDB197_DBD420(Integer DB197_DBD420) {
        this.DB197_DBD420 = DB197_DBD420;
    }

    public Integer getDB197_DBD424() {
        return DB197_DBD424;
    }

    public void setDB197_DBD424(Integer DB197_DBD424) {
        this.DB197_DBD424 = DB197_DBD424;
    }

    public Integer getDB197_DBD436() {
        return DB197_DBD436;
    }

    public void setDB197_DBD436(Integer DB197_DBD436) {
        this.DB197_DBD436 = DB197_DBD436;
    }

    public Integer getDB197_DBD440() {
        return DB197_DBD440;
    }

    public void setDB197_DBD440(Integer DB197_DBD440) {
        this.DB197_DBD440 = DB197_DBD440;
    }

    public Integer getDB197_DBD452() {
        return DB197_DBD452;
    }

    public void setDB197_DBD452(Integer DB197_DBD452) {
        this.DB197_DBD452 = DB197_DBD452;
    }

    public Integer getDB197_DBD456() {
        return DB197_DBD456;
    }

    public void setDB197_DBD456(Integer DB197_DBD456) {
        this.DB197_DBD456 = DB197_DBD456;
    }

    public Integer getDB197_DBD468() {
        return DB197_DBD468;
    }

    public void setDB197_DBD468(Integer DB197_DBD468) {
        this.DB197_DBD468 = DB197_DBD468;
    }

    public Integer getDB197_DBD472() {
        return DB197_DBD472;
    }

    public void setDB197_DBD472(Integer DB197_DBD472) {
        this.DB197_DBD472 = DB197_DBD472;
    }

    public Integer getDB197_DBD484() {
        return DB197_DBD484;
    }

    public void setDB197_DBD484(Integer DB197_DBD484) {
        this.DB197_DBD484 = DB197_DBD484;
    }

    public Integer getDB197_DBD488() {
        return DB197_DBD488;
    }

    public void setDB197_DBD488(Integer DB197_DBD488) {
        this.DB197_DBD488 = DB197_DBD488;
    }

    public Integer getDB197_DBD548() {
        return DB197_DBD548;
    }

    public void setDB197_DBD548(Integer DB197_DBD548) {
        this.DB197_DBD548 = DB197_DBD548;
    }

    public Integer getDB197_DBD552() {
        return DB197_DBD552;
    }

    public void setDB197_DBD552(Integer DB197_DBD552) {
        this.DB197_DBD552 = DB197_DBD552;
    }

    public Integer getDB197_DBD568() {
        return DB197_DBD568;
    }

    public void setDB197_DBD568(Integer DB197_DBD568) {
        this.DB197_DBD568 = DB197_DBD568;
    }

    public Integer getDB197_DBD580() {
        return DB197_DBD580;
    }

    public void setDB197_DBD580(Integer DB197_DBD580) {
        this.DB197_DBD580 = DB197_DBD580;
    }

    public Integer getDB197_DBD584() {
        return DB197_DBD584;
    }

    public void setDB197_DBD584(Integer DB197_DBD584) {
        this.DB197_DBD584 = DB197_DBD584;
    }

    public Integer getIW90() {
        return IW90;
    }

    public void setIW90(Integer IW90) {
        this.IW90 = IW90;
    }

    public Integer getIW92() {
        return IW92;
    }

    public void setIW92(Integer IW92) {
        this.IW92 = IW92;
    }

    public Integer getIW94() {
        return IW94;
    }

    public void setIW94(Integer IW94) {
        this.IW94 = IW94;
    }

    public Integer getIW96() {
        return IW96;
    }

    public void setIW96(Integer IW96) {
        this.IW96 = IW96;
    }

    public Integer getIW98() {
        return IW98;
    }

    public void setIW98(Integer IW98) {
        this.IW98 = IW98;
    }

    public String getMW2078() {
        return MW2078;
    }

    public void setMW2078(String MW2078) {
        this.MW2078 = MW2078;
    }

    public Integer getMW2112() {
        return MW2112;
    }

    public void setMW2112(Integer MW2112) {
        this.MW2112 = MW2112;
    }

    public String getMW254() {
        return MW254;
    }

    public void setMW254(String MW254) {
        this.MW254 = MW254;
    }

    public String getMW258() {
        return MW258;
    }

    public void setMW258(String MW258) {
        this.MW258 = MW258;
    }

    public Integer getMW294() {
        return MW294;
    }

    public void setMW294(Integer MW294) {
        this.MW294 = MW294;
    }
}
