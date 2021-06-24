package com.adasoraninda;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {

    void save(T data);

    Optional<T> findById(int id);

    void update(T data);

    void delete(int id);

    List<T> getAll();
}
