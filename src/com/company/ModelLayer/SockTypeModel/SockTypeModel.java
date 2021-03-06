package com.company.ModelLayer.SockTypeModel;

import com.company.DAOLayer.IDAODBSockType;
import com.company.ModelLayer.ISockTypeModel;

import javax.jws.WebService;
import java.util.List;


@WebService(endpointInterface = "com.company.ModelLayer.ISockTypeModel")
public class SockTypeModel implements ISockTypeModel {

    IDAODBSockType daoSockType;

    public SockTypeModel(IDAODBSockType dao)
    {
        this.daoSockType = dao;
    }

    @Override
    public List<SockType> getAllSockTypes(boolean onlyActive) {
        List<SockType> allTypes = daoSockType.getAllSockTypes();
        List<SockType>  result = null;
        if (onlyActive)
        {
            for (SockType type: allTypes) {
                if (type.active)
                {
                    result.add(type);
                }
            }
        }
        else
        {
            result = allTypes;
        }
        return  result;
    }

    @Override
    public SockType updateSockType(SockType type) {
        return (SockType) daoSockType.updateSockType(type);
    }

    @Override
    public boolean deleteSockType(int id) {
        return daoSockType.deactivateSockType(id);
    }

    @Override
    public SockType addSockType(SockType newSockType) {
        int id = daoSockType.addSockType(newSockType);
        return (SockType) daoSockType.getById(id);
    }
}
