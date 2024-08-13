package com.kavin;
class Book
{
	String title;
	String author;
    String  ISBN;
    
    Book(String title,String author,String  ISBN)
    {
    	this.title=title;
    	this.author=author;
    	this.ISBN=ISBN;
    }
    public String GetTitle()
    {
    	return title;
    }
    String GetAuthor()
    {
    	return author;
    }
    
}
public class MyBook {

	public static void main(String[] args) {
	System.out.println("Books Add and Update");
	Book book1 = new Book("Song of Ice and Fire","Georg RR Martin","1234567890");
//	Book book2 = new Book("Naruto","Kishimoto","1567890123");
	
	System.out.println(book1.GetTitle());

	}

}
