package com.burcu.repository;

import jakarta.persistence.Tuple;

import java.util.List;
import java.util.Optional;

public interface ICrud <T,ID>{
    T save(T entity);
    Iterable<T> saveAll(Iterable<T> entities);
    Optional<T> findById(ID id);
    Optional<T> findByColumn(String column,String value);
    List<T> findAll();
    List<T> findByColumnAndValue(String columnName, Object value);
    List<T> findAllEntity(T entity);

}
