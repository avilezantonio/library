package com.hcl.training.library.model;

import java.time.LocalDate;

public final class Loan {

	private Book book;
	private User user;
	private Staff staff;
	private LocalDate init;
	private LocalDate delivery;

	public Loan(Book book, User user, Staff staff, LocalDate init, LocalDate delivery) {
		this.book = book;
		this.user = user;
		this.staff = staff;
		this.init = init;
		this.delivery = delivery;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public LocalDate getInit() {
		return init;
	}

	public void setInit(LocalDate init) {
		this.init = init;
	}

	public LocalDate getDelivery() {
		return delivery;
	}

	public void setDelivery(LocalDate delivery) {
		this.delivery = delivery;
	}

}
