package com.journaldev.DAO;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-27
 * @Description: com.journaldev.DAO
 * @Version:1.0
 */
public class BookDaoImpl implements BookDao{

    private List<Books> books;

    public BookDaoImpl() {

        this.books = new ArrayList<>();
        books.add(new Books(1, "Java"));
        books.add(new Books(2, "Python"));
        books.add(new Books(3, "Android"));
    }


    @Override
    public List<Books> getAllBooks() {
        return books;
    }

    @Override
    public Books getBookByIsbn(int isbn) {
        return books.get(isbn);
    }

    @Override
    public void saveBook(Books book) {
        books.add(book);

    }

    @Override
    public void deleteBook(Books book) {
        books.remove(book);

    }
}
