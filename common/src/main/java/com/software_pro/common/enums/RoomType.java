package com.software_pro.common.enums;

public enum  RoomType {
    PVP("玩家对战"),

    PVR("人机对战"),

            ;
    private String msg;

    private RoomType(String msg) {
        this.msg = msg;
    }

    public final String getMsg() {
        return msg;
    }

    public final void setMsg(String msg) {
        this.msg = msg;
    }
}
