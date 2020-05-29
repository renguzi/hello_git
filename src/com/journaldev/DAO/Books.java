package com.journaldev.DAO;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-27
 * @Description: com.journaldev.DAO
 * @Version:1.0
 */
public class Books {
    private int isbn;
    private String bookName;

    public Books() {

    }

    public Books(int isbn, String bookName) {
        this.bookName = bookName;
        this.isbn = isbn;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
