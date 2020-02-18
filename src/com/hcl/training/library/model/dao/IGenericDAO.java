package com.hcl.training.library.model.dao;

import java.util.List;
import java.util.function.Predicate;

public interface IGenericDAO<T> {

	public boolean save(T t);

	public boolean delete(T t);

	public boolean update(T t);

	public T find(Predicate<T> predicate);

	public List<T> findAll();

}
