package com.demo.pojo.log4j;

import java.util.Date;

public class ResWarn {
    private Long warnId;
    //告警模块
    private String warnModule;
    //告警内容
    private String warnMsg;
    //处理状态0：未处理 1：已处理
    private int warnStatus;
    //告警时间
    private Date warnTime;
    //处理人
    private String handleUser;
    //处理记录
    private String handleMsg;
    //处理时间
    private Date handleTime;
    //扫描起始时间
    private Date startTime;
    //错误的数量
    private Long errorCount;
    //警告的数量
    private Long warnCount;

    public Long getWarnId() {
        return warnId;
    }

    public void setWarnId(Long warnId) {
        this.warnId = warnId;
    }

    public String getWarnModule() {
        return warnModule;
    }

    public void setWarnModule(String warnModule) {
        this.warnModule = warnModule;
    }

    public String getWarnMsg() {
        return warnMsg;
    }

    public void setWarnMsg(String warnMsg) {
        this.warnMsg = warnMsg;
    }

    public int getWarnStatus() {
        return warnStatus;
    }

    public void setWarnStatus(int warnStatus) {
        this.warnStatus = warnStatus;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getHandleMsg() {
        return handleMsg;
    }

    public void setHandleMsg(String handleMsg) {
        this.handleMsg = handleMsg;
    }

    public Date getWarnTime() {
        return warnTime;
    }

    public void setWarnTime(Date warnTime) {
        this.warnTime = warnTime;
    }

    public String getHandleUser() {
        return handleUser;
    }

    public void setHandleUser(String handleUser) {
        this.handleUser = handleUser;
    }

    public Date getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
    }

    public Long getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(Long errorCount) {
        this.errorCount = errorCount;
    }

    public Long getWarnCount() {
        return warnCount;
    }

    public void setWarnCount(Long warnCount) {
        this.warnCount = warnCount;
    }

    @Override
    public String toString() {
        return "ResWarn{" +
                "warnId=" + warnId +
                ", warnModule='" + warnModule + '\'' +
                ", warnMsg='" + warnMsg + '\'' +
                ", warnStatus=" + warnStatus +
                ", warnTime=" + warnTime +
                ", handleUser='" + handleUser + '\'' +
                ", handleMsg='" + handleMsg + '\'' +
                ", handleTime=" + handleTime +
                ", startTime=" + startTime +
                ", errorCount=" + errorCount +
                ", warnCount=" + warnCount +
                '}';
    }
}
