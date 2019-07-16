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
public class AuthorDaoTest {

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
    public void addGetDeleteAuthor() {

        Author author = new Author();
        author.setFirst_name("");
        author.setLast_name("");
        author.setCity("");
        author.setState("");
        author.setEmail("");
        author.setPhone("");
        author.setPostal_code("");

        author = authorDao.addAuthor(author);

        Author author1 = authorDao.getAuthor(author.getId());

        assertEquals(author1, author);

        authorDao.deleteAuthor(author.getId());

        author1 = authorDao.getAuthor(author.getId());

        assertNull(author1);

    }

    @Test
    public void getAllAuthors() {

        Author author = new Author();
        author.setFirst_name("");
        author.setLast_name("");
        author.setCity("");
        author.setState("");
        author.setEmail("");
        author.setPhone("");
        author.setPostal_code("");

        author = authorDao.addAuthor(author);

        Author author1 = new Author();
        author.setFirst_name("");
        author.setLast_name("");
        author.setCity("");
        author.setState("");
        author.setEmail("");
        author.setPhone("");
        author.setPostal_code("");

        author1 = authorDao.addAuthor(author1);

        List<Author> authorList = authorDao.getAllAuthors();

        assertEquals(authorList.size(), 2);
    }

    @Test
    public void updateAuthor() {

        Author author = new Author();
        author.setFirst_name("");
        author.setLast_name("");
        author.setCity("");
        author.setState("");
        author.setEmail("");
        author.setPhone("");
        author.setPostal_code("");

        author = authorDao.addAuthor(author);

        authorDao.updateAuthor(author);

        Author author1 = authorDao.getAuthor(author.getId());
        assertEquals(author1, author);
    }
}
