package com.languageFundamentals.constructors;

public class Book {
    int bookId;
    String title;
    String author;
    
    //parameterized constructor
    Book(int bookId,String title, String author){
    	 this.bookId=bookId;
    	 this.title=title;
    	 this.author=author;
    	 }
    //copy constructor
    Book(Book b1){
    	 this.bookId=b1.bookId;
    	 this.title=b1.title;
    	 this.author=b1.author;
    }
    void display() {
    	System.out.println("book ID:"+bookId);
    	System.out.println("title of the book"+title);
    	System.out.println("author of the book:"+author);
    }
    
	public static void main(String[] args) {
    Book b1=new Book(101,"end of the world","people");
    Book b2=new Book(b1);
    b1.display();
    b2.display();
	}

}
