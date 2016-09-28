package com.jesse.bean;


import java.io.Serializable;

public class MasterOrder implements Serializable {
    /**
     * 唯一自增id。此id不是订单id，只是自增长而已
     */
    private long id;

    /**
     * 订单id。是唯一的，由代码生成。
     */
    private String orderId;

    /**
     * 客户的用户id
     */
    private int customerUserId;

    /**
     * 订单状态
     */
    private int orderStatus;

    /**
     * 订单类型
     */
    private int orderType;

    /**
     * 订单创建时间
     */
    private long createTime;

    /**
     * 服务者的用户id
     */
    private int serviceUserId;

    /**
     * 拍摄日期。每个订单都必须有拍摄日期
     */
    private String shotDate;

    /**
     * 订单所属的城市ID。此ID是属于我们自己的ID
     */
    private int cityId;

    /**
     * 订单的截止时间
     */
    private long deadlineTime;

    /**
     * 0 默认 1加 2不加
     */
    private int isAddsheet;

    /**
     * 客片是否显示 0显示 1不显示
     */
    private int isShow;

    private static final long serialVersionUID = 1L;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Integer getCustomerUserId() {
        return customerUserId;
    }

    public void setCustomerUserId(int customerUserId) {
        this.customerUserId = customerUserId;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getOrderType() {
        return orderType;
    }

    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public int getServiceUserId() {
        return serviceUserId;
    }

    public void setServiceUserId(int serviceUserId) {
        this.serviceUserId = serviceUserId;
    }

    public String getShotDate() {
        return shotDate;
    }

    public void setShotDate(String shotDate) {
        this.shotDate = shotDate == null ? null : shotDate.trim();
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public long getDeadlineTime() {
        return deadlineTime;
    }

    public void setDeadlineTime(long deadlineTime) {
        this.deadlineTime = deadlineTime;
    }

    public int getIsAddsheet() {
        return isAddsheet;
    }

    public void setIsAddsheet(int isAddsheet) {
        this.isAddsheet = isAddsheet;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(int isShow) {
        this.isShow = isShow;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", customerUserId=").append(customerUserId);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", orderType=").append(orderType);
        sb.append(", createTime=").append(createTime);
        sb.append(", serviceUserId=").append(serviceUserId);
        sb.append(", shotDate=").append(shotDate);
        sb.append(", cityId=").append(cityId);
        sb.append(", deadlineTime=").append(deadlineTime);
        sb.append(", isAddsheet=").append(isAddsheet);
        sb.append(", isShow=").append(isShow);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
