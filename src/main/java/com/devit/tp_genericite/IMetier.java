package com.devit.tp_genericite;

import java.util.List;

interface IMetier<T> {
    void add(T o);
    List<T> getAll();
    T findById(long id);
    void delete(long id);
}
