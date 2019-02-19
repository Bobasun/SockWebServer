package com.company.ModelLayer;

import com.company.ModelLayer.ISock;

import java.util.List;


public interface ISearchManager {
    List<ISock> search(String fieldName, Object searchParam);
}
