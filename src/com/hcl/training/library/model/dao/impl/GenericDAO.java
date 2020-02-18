package com.hcl.training.library.model.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

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
	public T find(Predicate<T> predicate) {
		Optional<T> entity = this.getStorage().stream().filter(predicate).findAny();
		return entity.orElse(null);
	}

	@Override
	public List<T> findAll() {
		return this.getStorage();
	}

	protected List<T> getStorage() {
		return this.storage;
	}

}
