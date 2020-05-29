package com.journaldev.DAO;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-27
 * @Description: com.journaldev.DAO
 * @Version:1.0
 */
public class AccessBook {

    public static void main(String[] args) {

        BookDao bookDao = new BookDaoImpl();

        for (Books book : bookDao.getAllBooks()) {
            System.out.println("Book ISBN : " + book.getIsbn()+"Book name:"+book.getBookName());
        }

        Books book = bookDao.getAllBooks().get(1);
        book.setBookName("Algorithms");
        bookDao.saveBook(book);

        for (Books book1 : bookDao.getAllBooks()) {
            System.out.println("Book ISBN : " + book1.getIsbn()+"Book name:"+book1.getBookName());
        }

    }
}
