package com.example.restservicehpe.repository;

public interface demoRepo<T>{
    boolean existsById(Integer id);

    public void save(T t);
}
