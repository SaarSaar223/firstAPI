package com.first.jooq.repository;
import java.util.List;

public interface RepositoryInterface<T> {
    public void insert(T t);
    public List<T> getAll();
}
