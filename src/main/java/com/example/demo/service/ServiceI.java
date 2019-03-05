package com.example.demo.service;

import java.util.List;

public interface ServiceI<T> {

    public T create(T t);
    public T read(T t);
    public T update(T t);
    public T delete(T t);
    public List<T> readAll();
}
