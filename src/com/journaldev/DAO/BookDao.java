package com.journaldev.DAO;

import java.util.List;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-27
 * @Description: com.journaldev.DAO
 * @Version:1.0
 */
public interface BookDao {
    List<Books> getAllBooks();

    Books getBookByIsbn(int isbn);

    void saveBook(Books book);

    void deleteBook(Books book);

}
