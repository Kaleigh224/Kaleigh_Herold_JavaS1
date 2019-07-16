package com.company.KaleighHeroldU1M5Summative.dao;


import com.company.KaleighHeroldU1M5Summative.model.Author;
import com.company.KaleighHeroldU1M5Summative.model.Book;
import com.company.KaleighHeroldU1M5Summative.model.Publisher;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class BookDaoTest {

    @Autowired
    AuthorDao authorDao;
    @Autowired
    BookDao bookDao;
    @Autowired
    PublisherDao publisherDao;

    @Before
    public void setUp() throws Exception {

        List<Book> bookList = bookDao.getAllBooks();
        for (Book b : bookList) {
            bookDao.deleteBook(b.getId());
        }

        List<Author> authorList = authorDao.getAllAuthors();
        for (Author a : authorList) {
            authorDao.deleteAuthor(a.getId());
        }

        List <Publisher> publisherList = publisherDao.getAllPublishers();
        for (Publisher p : publisherList) {
            publisherDao.deletePublisher(p.getId());
        }
    }

    @Test
    public void addGetDeleteBook() {

         // assemble -- this is for Book not author -- addGetDeleteBook
        Author author = new Author();
        author.setFirst_name("");
        author.setLast_name("");
        author.setCity("");
        author.setState("");
        author.setEmail("");
        author.setPhone("");
        author.setPostal_code("");

        author = authorDao.addAuthor(author);

        Publisher publisher = new Publisher();
        publisher.setName("");
        publisher.setEmail("");
        publisher.setPhone("");
        publisher.setCity("");
        publisher.setStreet("");
        publisher.setPostal_code("");
        publisher.setState("");

        publisher = publisherDao.addPublisher(publisher);

        Book book = new Book();
        book.setIsbn("");
        book.setPublish_date("");
        book.setAuthor_id(author.getId());
        book.setPublisher_id(publisher.getId());
        book.setTitle("");
        book.setPrice(1.1);

        book = bookDao.addBook(book);
        // Act
        Book book1 = bookDao.getBook(book.getId());

        // assert
        assertEquals(book1, book);

        bookDao.deleteBook(book.getId());

        book1 = bookDao.getBook(book.getId());

        assertNull(book1);

    }

    @Test(expected = DataIntegrityViolationException.class)
    public void addWithRefIntegrityException() {

        Author author = new Author();
        author.setFirst_name("");
        author.setLast_name("");
        author.setCity("");
        author.setState("");
        author.setEmail("");
        author.setPhone("");
        author.setPostal_code("");

        author = authorDao.addAuthor(author);

        Publisher publisher = new Publisher();
        publisher.setName("");
        publisher.setEmail("");
        publisher.setPhone("");
        publisher.setCity("");
        publisher.setStreet("");
        publisher.setPostal_code("");
        publisher.setState("");

        publisher = publisherDao.addPublisher(publisher);

        Book book = new Book();
        book.setIsbn("");
        book.setPublish_date("");
        book.setAuthor_id(author.getId());
        book.setPublisher_id(publisher.getId());
        book.setTitle("");
        book.setPrice(1.1);

        book = bookDao.addBook(book);
    }

    @Test
    public void getAllBooks() {

        Author author = new Author();
        author.setFirst_name("");
        author.setLast_name("");
        author.setCity("");
        author.setState("");
        author.setEmail("");
        author.setPhone("");
        author.setPostal_code("");

        author = authorDao.addAuthor(author);

        Publisher publisher = new Publisher();
        publisher.setName("");
        publisher.setEmail("");
        publisher.setPhone("");
        publisher.setCity("");
        publisher.setStreet("");
        publisher.setPostal_code("");
        publisher.setState("");

        publisher = publisherDao.addPublisher(publisher);

        Book book = new Book();
        book.setIsbn("");
        book.setPublish_date("");
        book.setAuthor_id(author.getId());
        book.setPublisher_id(publisher.getId());
        book.setTitle("");
        book.setPrice(1.1);

        book = bookDao.addBook(book);

        List<Book> bookList = bookDao.getAllBooks();

        assertEquals(bookList, 2);
    }

    @Test
    public void updateBook() {

        Author author = new Author();
        author.setFirst_name("");
        author.setLast_name("");
        author.setCity("");
        author.setState("");
        author.setEmail("");
        author.setPhone("");
        author.setPostal_code("");

        author = authorDao.addAuthor(author);

        Publisher publisher = new Publisher();
        publisher.setName("");
        publisher.setEmail("");
        publisher.setPhone("");
        publisher.setCity("");
        publisher.setStreet("");
        publisher.setPostal_code("");
        publisher.setState("");

        publisher = publisherDao.addPublisher(publisher);

        Book book = new Book();
        book.setIsbn("");
        book.setPublish_date("");
        book.setAuthor_id(author.getId());
        book.setPublisher_id(publisher.getId());
        book.setTitle("");
        book.setPrice(1.1);

        book = bookDao.addBook(book);

        bookDao.updateBook(book);

        Book book1 = bookDao.getBook(book.getId());
        assertEquals(book1, book);
    }

}
