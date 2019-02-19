package com.company.DAOLayer;

import com.company.ModelLayer.IOwnerData;

public interface IDAODBOwner {
    IOwnerData getOwnerById(int id);
}
