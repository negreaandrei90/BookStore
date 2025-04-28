package com.neontodo.BookStore_API.services;

import com.neontodo.BookStore_API.model.Author;
import com.neontodo.BookStore_API.model.Book;
import com.neontodo.BookStore_API.model.Category;

import java.util.List;
import java.util.UUID;

public interface BookService {
    Book findBookByUuid(UUID uuid);
    List<Book> findBooksByAuthor(Author author);
    List<Book> findBooksByCategory(Category category);

}
