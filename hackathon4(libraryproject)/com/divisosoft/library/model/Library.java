package com.divisosoft.library.model;

import com.divisosoft.library.model.Book;
import java.util.List;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.*;
public class Library<T extends Book> 
{   
    public  List<T> books = new ArrayList<>();

    public void addCartoon(Cartoon cartoonBook)
	{
        if(cartoonBook instanceof Book) //books.add((cartoonBook instanceof Book) ? (T) cartoonBook : null);
		{
            books.add((T) cartoonBook);
        } 
    }

    public void addScience(Science scienceBook) 
	{
        if(scienceBook instanceof Book)
		{
            books.add((T) scienceBook);
        } 
    }


 public void readBooksFromCSV(String filePath) throws IOException 
 {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) 
		{
            String line;
            boolean firstLine = true; 
            while ((line = reader.readLine()) != null) 
			{
                if (firstLine)
					{
                    firstLine = false;
                    continue; 
                }

                String[] fields = line.split(",");
                if (fields.length >= 6) { 
                    String title = fields[0];
                    String author = fields[1];
                    String isbn = fields[2];
                    int price = Integer.parseInt(fields[3]);
                        String cartoonCharacter = fields[4];
                        Cartoon cartoonBook = new Cartoon(title, author, isbn, price, cartoonCharacter);
                        addCartoon(cartoonBook); 
                        String general = fields[5];
                        Science scienceBook = new Science(title, author, isbn, price, general);
                        addScience(scienceBook);
                    
                }
            }
        }
    }
	
    public void readCartoonBooks() 
	{
		for (T book : books)
		{
			if(book instanceof Cartoon)
			{
				 System.out.println(book);
			}
         //System.out.println(book.getTitle() + " by " + book.getAuthor() + " (ISBN: " + book.getIsbn() + ")");
        }
		}
			
	
  public void readScienceBooks() 
	{	
		for (T book : books)
		{
			if(book instanceof Science)
			{
				System.out.println(book);
				//System.out.println(book.getTitle() + " by " + book.getAuthor() + " (ISBN: " + book.getIsbn() + ")");
			}
		}	
    }
	
	public void updateCartoonBook(String oldIsbn,String newIsbn)
	{
		ListIterator<T> iteratorr = books.listIterator();
		while(iteratorr.hasNext())
		{
			T book = iteratorr.next();
			if(book.getIsbn().trim().equals(oldIsbn.trim()))
			{
				book.setIsbn(newIsbn);
			}
		}	
			
	}
	
		public void updateScienceBook(String oldIsbn,String newIsbn)
	{
		ListIterator<T> iteratorr = books.listIterator();
		while(iteratorr.hasNext())
		{
			T book = iteratorr.next();
			if(book.getIsbn().trim().equals(oldIsbn.trim()))
			{
				book.setIsbn(newIsbn);
			}
		}	
			
	}
	
public void removeBookByISBN(String isbn) 
{
    Iterator<T> iterator = books.iterator();
    while (iterator.hasNext()) {
        T book = iterator.next();
        if (book.getIsbn().trim().equals(isbn.trim()))
			{
            iterator.remove();
            break; 
        }
    }
}

}