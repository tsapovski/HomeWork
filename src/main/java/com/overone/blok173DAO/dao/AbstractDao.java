package com.overone.blok173DAO.dao;

import com.overone.blok173DAO.entity.Phone;

import java.util.List;

public abstract class AbstractDao <K extends Number, T>{

    public abstract List<T> findAll();

    public abstract T findEntityById(K id);

    public abstract  boolean delete (K id);

    public  abstract  boolean delete (T entity);

    public abstract boolean create (T entity);

    public abstract void update(Phone entity);
}
