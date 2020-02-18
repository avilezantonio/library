package com.hcl.training.library.model.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.hcl.training.library.model.dao.IGenericDAO;

public abstract class GenericDAO<T> implements IGenericDAO<T> {

	private List<T> storage = new ArrayList<>();

	@Override
	public boolean save(T t) {
		return this.getStorage().add(t);
	}

	@Override
	public boolean delete(T t) {
		return this.getStorage().remove(t);
	}

	@Override
	public boolean update(T t) {
		return this.delete(t) && this.save(t);
	}

	@Override
	public List<T> findAll() {
		return this.getStorage();
	}

	private List<T> getStorage() {
		return this.storage;
	}

}
