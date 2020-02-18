package com.hcl.training.library.model.service;

import java.util.List;

import com.hcl.training.library.model.Book;
import com.hcl.training.library.model.Staff;
import com.hcl.training.library.model.dao.IGenericDAO;
import com.hcl.training.library.model.dao.impl.GenericDAO;
import com.hcl.training.library.util.Constants;

public class BookService {

	private IGenericDAO<Book> bookDAO;

	public BookService() {
		this.bookDAO = new GenericDAO<Book>() {
		};
	}

	private boolean isAdmin(Staff staff) {
		return Constants.ADMIN.equalsIgnoreCase(staff.getType());
	}

	public boolean addNewBook(Book book, Staff staff) {
		return isAdmin(staff) && this.bookDAO.save(book);
	}

	public Book findByName(final String name) {
		return this.bookDAO.find((b) -> b.getName().equals(name));
	}

	public Book findById(final int id) {
		return this.bookDAO.find((b) -> b.getId() == id);
	}

	public Book findByAuthor(final String author) {
		return this.bookDAO.find((b) -> b.getAuthor().equalsIgnoreCase(author));
	}

	public boolean deleteBook(Book book, Staff staff) {
		return isAdmin(staff) && this.bookDAO.delete(book);
	}

	public List<Book> getAllBooks() {
		return this.bookDAO.findAll();
	}

}
