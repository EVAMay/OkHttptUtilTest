package com.byd.ykygj.interfacetest.entity;

/**
 * Created by Administrator on 2017/6/10.
 */

public class OperationInfo {

    /**
     * code : 0
     * msg : 开阀指令已下发，请关注阀门状态指示灯。
     */

    private int code;
    private String msg;

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
}
