package ua.lviv.iot.persistence.dao;

public interface IDao<T> {

    T findById(Integer id);

    void remove(Integer id);

    T update(T object);

    T persist(T object);

}