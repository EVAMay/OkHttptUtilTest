package com.byd.ykygj.interfacetest.entity;

/**
 * Created by Administrator on 2017/6/10.
 */

public class LocationData {

    /**
     * code : 0
     * msg :
     * data : {"licencePlate":"川AJ5261","longitude":107.498703,"latitude":31.170541,"direction":290,"speed":0,"gpsTime":"2017-06-10 15:31:42","isOnline":0,"statusDesc":"离线"}
     */

    private int code;
    private String msg;
    private DataBean data;

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

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * licencePlate : 川AJ5261
         * longitude : 107.498703
         * latitude : 31.170541
         * direction : 290
         * speed : 0
         * gpsTime : 2017-06-10 15:31:42
         * isOnline : 0
         * statusDesc : 离线
         */

        private String licencePlate;
        private double longitude;
        private double latitude;
        private int direction;
        private int speed;
        private String gpsTime;
        private int isOnline;
        private String statusDesc;

        public String getLicencePlate() {
            return licencePlate;
        }

        public void setLicencePlate(String licencePlate) {
            this.licencePlate = licencePlate;
        }

        public double getLongitude() {
            return longitude;
        }

        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }

        public double getLatitude() {
            return latitude;
        }

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }

        public int getDirection() {
            return direction;
        }

        public void setDirection(int direction) {
            this.direction = direction;
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
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

        public String getStatusDesc() {
            return statusDesc;
        }

        public void setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
        }
    }
}
