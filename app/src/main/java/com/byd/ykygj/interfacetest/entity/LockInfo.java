package com.byd.ykygj.interfacetest.entity;

import java.util.List;

/**
 * Created by Administrator on 2017/6/10.
 */

public class LockInfo {

    /**
     * code : 0
     * msg :
     * billCode : 4300-1706109291
     * licencePlate : 川AJ6715
     * valve : 1
     * gpsTime : 2017-06-10 16:40:50
     * isOnline : 1
     * tankNo : 2
     * powerStatus : 供电
     * gasSourceStatus : 开启
     * data : [{"valveId":3,"tankNo":2,"valveDesc":"后舱 下阀门","status":"关闭"},{"valveId":6,"tankNo":2,"valveDesc":"后舱 上阀门","status":"关闭"}]
     */

    private int code;
    private String msg;
    private String billCode;
    private String licencePlate;
    private int valve;
    private String gpsTime;
    private int isOnline;
    private int tankNo;
    private String powerStatus;
    private String gasSourceStatus;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public int getValve() {
        return valve;
    }

    public void setValve(int valve) {
        this.valve = valve;
    }

    public String getGpsTime() {
        return gpsTime;
    }

    public void setGpsTime(String gpsTime) {
        this.gpsTime = gpsTime;
    }

    public int getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(int isOnline) {
        this.isOnline = isOnline;
    }

    public int getTankNo() {
        return tankNo;
    }

    public void setTankNo(int tankNo) {
        this.tankNo = tankNo;
    }

    public String getPowerStatus() {
        return powerStatus;
    }

    public void setPowerStatus(String powerStatus) {
        this.powerStatus = powerStatus;
    }

    public String getGasSourceStatus() {
        return gasSourceStatus;
    }

    public void setGasSourceStatus(String gasSourceStatus) {
        this.gasSourceStatus = gasSourceStatus;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * valveId : 3
         * tankNo : 2
         * valveDesc : 后舱 下阀门
         * status : 关闭
         */

        private String valveId;
        private int tankNo;
        private String valveDesc;
        private String status;

        public String getValveId() {
            return valveId;
        }

        public void setValveId(String valveId) {
            this.valveId = valveId;
        }

        public int getTankNo() {
            return tankNo;
        }

        public void setTankNo(int tankNo) {
            this.tankNo = tankNo;
        }

        public String getValveDesc() {
            return valveDesc;
        }

        public void setValveDesc(String valveDesc) {
            this.valveDesc = valveDesc;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }
}
