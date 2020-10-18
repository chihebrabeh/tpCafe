package com.cafe.demo.services.services;

import java.util.List;


public interface AbstractService <T>{

    public Object save(T entity);
    public void update(T entity);
    public void delete(T entity) ;
    public List<T> findAll();

}
