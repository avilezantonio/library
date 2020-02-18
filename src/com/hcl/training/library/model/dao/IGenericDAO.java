package com.hcl.training.library.model.dao;

import java.util.List;

public interface IGenericDAO<T> {

	public boolean save(T t);

	public boolean delete(T t);

	public boolean update(T t);

	public T find(long id);

	public List<T> findAll();

}
