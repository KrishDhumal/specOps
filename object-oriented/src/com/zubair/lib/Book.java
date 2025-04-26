package com.zubair.lib;

public class Book {
	private String title;
	private Member mbr;

	public Book(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void status() {
		if (mbr == null)
			System.out.println(title + " is not issued to any member");
		else
			System.out.println(title + " is issued to " + mbr.getName());
	}

	public void issueBook(Member m) {
		if (m == null) {
			System.out.println("Cannot issue book: Invalid member.");
			return;
		}
		if (mbr != null) {
			System.out.println("Cannot issue book: Already issued to " + mbr.getName());
			return;
		}
		if (m.getBook() != null) {
			System.out.println("Cannot issue book: " + m.getName() + " already has a book.");
			return;
		}
		this.mbr = m;
		m.setBook(this);
		System.out.println("Book issued");
	}

	public void returnBook(Member m) {
		if (m == null) {
			System.out.println("Cannot return book: Invalid member.");
			return;
		}
		if (m.getBook() == null) {
			System.out.println(m.getName() + " does not have any book to return.");
			return;
		}
		if (!mbr.getName().equals(m.getName())) {
			System.out.println("This book was not issued to " + m.getName() + ". Cannot return.");
		} else {
			mbr = null;
			m.setBook(null);
			System.out.println("Book returned");
		}
	}
}
