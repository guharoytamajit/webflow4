package com.training.library.service;



import java.util.List;

import com.training.library.domain.Book;
import com.training.library.domain.BookCriteria;


public interface BookService {
    public List<Book> search(BookCriteria criteria);

    public Book findByIsbn(String isbn);
}
