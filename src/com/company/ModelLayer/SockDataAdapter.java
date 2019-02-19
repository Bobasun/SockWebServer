package com.company.ModelLayer;

import com.company.ModelLayer.ISock;
import com.company.ModelLayer.SockData;

import javax.xml.bind.annotation.adapters.XmlAdapter;


public class SockDataAdapter extends XmlAdapter<SockData,ISock> {

    @Override
    public ISock unmarshal(SockData v) throws Exception {
        return v;
    }

    @Override
    public SockData marshal(ISock v) throws Exception {
        return (SockData)v;
    }
}
