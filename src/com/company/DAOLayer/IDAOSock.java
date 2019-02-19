package com.company.DAOLayer;

import com.company.ModelLayer.ISock;

import java.sql.SQLException;
import java.util.List;

public interface IDAOSock {

    int addSock(ISock sock);
    int[] addSock(ISock[] sock);

    List<ISock> getSockCollection();
    ISock readSock(int id);
    List<ISock> getSockByCondition(String field,String condition,Object value) throws SQLException;

    boolean updateSock(ISock changedSock);

    boolean deleteSock(int id);
    boolean deleteSock(int[] id);
}
