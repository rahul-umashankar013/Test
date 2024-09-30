package com;

import java.util.Comparator;
import java.util.List;

public class Customer {
	 String customerName;
	    String address;
	    List<Book> borrowed;
	    
	    
	    public Book findMaxPrice(String publisher) {
	    	LibraryService ls=new LibraryService();
	    	List<Book> li=ls.getBooks();
	        return li.stream().filter(book -> book.publisher.equals(publisher)).max(Comparator.comparingDouble(book -> book.price)).orElse(null); 
	                    
	    }
}
