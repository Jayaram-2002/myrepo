package com.divisosoft.library.view;

import com.divisosoft.library.model.Book;
import com.divisosoft.library.controller.LibraryStreamProcessor;
import com.divisosoft.library.model.Library;
import java.util.OptionalDouble;
import java.util.OptionalDouble;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Tdd 
{
    public static void main(String[] args) 
	{  
        Library<Book> library = new Library<>();
		LibraryStreamProcessor libraryStream = new LibraryStreamProcessor();
		Scanner scan = new Scanner(System.in);
		boolean bool = true; 
		while(bool)
		{
		System.out.println("press 1: To Create Book Details");
		System.out.println("press 2: To Select Which Book Details To Read");
		System.out.println("press 3: To Update Book Details");
		System.out.println("Press 4: To Delete Book Details");
		System.out.println("press 5: To View Average Book Price");
		System.out.println("press 6: Exit");
		String num = scan.nextLine();	
		
		switch(num)
		{
			case"1":
				try 
				{
					library.readBooksFromCSV("D:\\Hackathon\\hackathon4(libraryproject)\\file.csv\\MOCK_DATA (5).csv");
				} 
				catch(IOException e)
				{
					e.printStackTrace();
					return; 
				}
				System.out.println("Book Details Added Successfully");
			break;
			
			case"2":
				boolean y = true;
            while(y) 
			{	
			System.out.println("Press:1 To Read CartoonBooks");
			System.out.println("Press:2 To Read ScienceBooks");
			System.out.println("press:3 Exit");
		
			String innerChoice = scan.nextLine();			
			switch(innerChoice)
			{
				case"1":
					System.out.println("Cartoon Books in the Library:");
					library.readCartoonBooks();
					break;
				case"2":
					System.out.println("Science Books in the Library:");
					library.readScienceBooks();
					break;
					
				case"3":
                      y = false;
                      break;

           default:
                 System.out.println("Invalid choice. Exiting.");
                 bool = false;
            break;	
			}
			}
			break;
			
			
			case"3":
			boolean z = true;
            while(z) 
			{	
				System.out.println("Press:1 To UpdateCartoonBook");
				System.out.println("Press:2 To UpdateScienceBook");
				System.out.println("press:3 Exit");
			
			String innerrChoice = scan.nextLine();			
			switch(innerrChoice)
			{	
					case"1":
					System.out.println("\n UpdateBook a book by ISBN :");
					System.out.println("First Enter The Old ISBN Number For Update and New ISBN Number For Latest,,,, ");
					library.updateCartoonBook(scan.nextLine(),scan.nextLine());
					System.out.println("Update Successfully");
					break;
					
					case"2":
					System.out.println("\n UpdateBook a book by ISBN :");
					System.out.println("First Enter The Old ISBN Number For Update and New ISBN Number For Latest ");
					library.updateScienceBook(scan.nextLine(),scan.nextLine());
					System.out.println("Update Successfully");
					break;
					case"3":
                     z = false;
                     break;

					default:
					System.out.println("Invalid choice. Exiting.");
					z = false;
					break;	
					
			}
			}
			break;
			
			case"4":
					System.out.println("\nRemoving a book by ISBN :");
					library.removeBookByISBN(scan.nextLine());
					System.out.println("delete Successfully");				
			break;
			
			case"5":
					double averagePrice = libraryStream.calculateAverageBookPrice(library);
					System.out.println("Average Book Price: " + averagePrice);
			break;
			
			case"6":
			System.out.println("THANK YOU FOR READING MY BOOK COME AGAIN.~~~~~~~~~~");
			System.out.println("\n");
			bool = false;
			break;

			default:
					System.out.println("Invalid choice. Exiting..........");
					System.out.println("\n");
					bool = false;
			break;
			
		}		  
		}
    }
}
