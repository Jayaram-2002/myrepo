package com.divisosoft.library.controller;

import com.divisosoft.library.model.Book;
import com.divisosoft.library.model.Library;
import java.util.Optional;
import java.util.*;

public class LibraryStreamProcessor 
{
      public  <T extends Book> double calculateAverageBookPrice(Library<T> library)
	  {
        List<T> books = library.books;
            OptionalDouble average = books.stream()
                    .mapToDouble(Book::getPrice)
                    .average();
            return average.orElse(0.0);
        }
}