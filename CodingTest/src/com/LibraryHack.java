package com;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class LibraryHack {

	public static void main(String[] args) {
		
		LibraryService ls=new LibraryService();
		List<Book> li=ls.getBooks();
		System.out.print(li);
		
		LibraryService library=new LibraryService("SOC","chennai",li);
			
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter");
		String input=sc.next();
		
		if(input=="admin")
		{ System.out.println("1.view ,2.addbook,3.remove book,4.findmaxprice");
		
		  int num=sc.nextInt();
		  switch(num)
		  {
		  case 1:       System.out.print("For view");
			            List<Book> booklist=library.getBooks();
			            booklist.stream().forEach((k)->System.out.println(k));
			            break;
			            
		  case 2:       Book newbook=new Book(1010,"balamurugan","arihant",10000);
			            ls.addBook(newbook);
			            break;
			          
		  case 3:        ls.removeBook(101);
		                 break;
		                 
		  case 4:       ls.findMaxPrice("arihant");
		                break;
			
			
		  }
		}
		else
		{     System.out.println("1.for view,2.find costly book based on publisher");
			  int num1=sc.nextInt();
			
			  switch(num1)
			  { 
			  case 1:      System.out.print("For view");
	                        List<Book> booklist=library.getBooks();
	                        booklist.stream().forEach((k)->System.out.println(k));
	                        break;
	                        
			  case 2:      Customer c=new Customer();
			               c.findMaxPrice("arihant");
			               break;
		}
		}
//		System.out.print("For view");
//		List<Book> booklist=library.getBooks();
//		booklist.stream().forEach((k)->System.out.println(k));
		
//		Book newbook=new Book(1010,"balamurugan","arihant",10000);
//		ls.addBook(newbook);
//		
//		ls.removeBook(101);
//		
//		ls.findMaxPrice("arihant");
		
		
		
		
		
		
		

	}

}
