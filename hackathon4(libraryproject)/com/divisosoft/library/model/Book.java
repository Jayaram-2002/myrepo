package com.divisosoft.library.model;

public class Book<T>
{
	private String title;
	private String author;
	private String isbn;  //isbn -> International Standard Book Number
	private int price;
	
	public Book(String title,String author,String isbn,int price)  
	{
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.price = price;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setAuthor(String author)
	{
		this.author = author;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public void setIsbn(String isbn)
	{
		this.isbn = isbn;
	}
	
	public String getIsbn()
	{
		return isbn;
	}
	
	public void setPrice(int price)
	{
		this.price = price;
	}
	
	public int getPrice()
	{
		return price;
	}

	public String toString()
	{
		String toString = "Title name is:"+title+"\n"+"author name is: "+author+"\n"+"isbn number is:\t"+isbn+"\n"+"price is: "+price;
		return toString;
	}
	
	
}