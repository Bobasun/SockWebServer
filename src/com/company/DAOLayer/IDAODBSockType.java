package com.company.DAOLayer;

import com.company.ModelLayer.SockTypeModel.ISockType;
import com.company.ModelLayer.SockTypeModel.SockType;

import java.util.List;


public interface IDAODBSockType {

    ISockType getById(int id);
    List<SockType> getAllSockTypes();
    int addSockType(ISockType type);
    ISockType updateSockType(ISockType changedType);
    boolean deactivateSockType(int id);
}
