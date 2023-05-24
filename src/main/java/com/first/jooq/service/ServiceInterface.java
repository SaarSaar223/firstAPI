package com.first.jooq.service;

import java.util.List;


public interface ServiceInterface<T> {

    public void insertObject(T t);

    public List<T> getAllObjects();
    
}
