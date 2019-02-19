package com.company.ModelLayer.SockTypeModel;


public interface ISockType {

    int getSockTypeId();
    String getSockTypeName();
    void setSockTypeName(String name);
    boolean getActive();
    void setActive(boolean active);
}
