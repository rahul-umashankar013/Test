package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LibraryService {
	
	    String libraryName;
	    String address;
	    List<Book>books;
	    public LibraryService()
	    {   
	    	books=new ArrayList<>();
	    	Book b1=new Book(101,"bhagat","arihant",1000);
			Book b2=new Book(102,"rahul","elesiver",1000);
			Book b3=new Book(103,"risabh","cameliam",1000);
			Book b4=new Book(104,"praga","ncert",1000);
			Book b5=new Book(105,"bala","arihant",1000);
			 books.add(b1);
			 books.add(b2);
			 books.add(b3);
			books.add(b4);
			books.add(b5);
			
			
			
			
	    }
		public LibraryService(String libraryName, String address, List<Book> books) {
			super();
			this.libraryName = libraryName;
			this.address = address;
			this.books = books;
		}
		public String getLibraryName() {
			return libraryName;
		}
		public void setLibraryName(String libraryName) {
			this.libraryName = libraryName;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public List<Book> getBooks() {
			return books;
		}
		public void setBooks(List<Book> books) {
			this.books = books;
		}
		
		public void addBook(Book b)
		{
			books.add(b);
			
			
		}
		public void removeBook(int bookIsbnNo) {
		                  books = books.stream()
		                 .filter(book -> book.bookIsbnNo != bookIsbnNo)
		                 .collect(Collectors.toList());
		}
		
		public Book findMaxPrice(String publisher) {
		                return books.stream()
		                .filter(book -> book.publisher.equals(publisher))
		                .max(Comparator.comparingDouble(book -> book.price))
		                .orElse(null);  // Returns null if no book is found
		}
		
	
}
