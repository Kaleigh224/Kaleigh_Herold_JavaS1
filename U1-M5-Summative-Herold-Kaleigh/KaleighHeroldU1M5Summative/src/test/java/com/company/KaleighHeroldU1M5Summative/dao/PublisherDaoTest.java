package com.company.KaleighHeroldU1M5Summative.dao;

import com.company.KaleighHeroldU1M5Summative.model.Author;
import com.company.KaleighHeroldU1M5Summative.model.Book;
import com.company.KaleighHeroldU1M5Summative.model.Publisher;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class PublisherDaoTest {

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
    public void addGetDeletePublisher() {

        Publisher publisher = new Publisher();
        publisher.setName("");
        publisher.setStreet("");
        publisher.setCity("");
        publisher.setState("");
        publisher.setEmail("");
        publisher.setPhone("");
        publisher.setPostal_code("");

        publisher = publisherDao.addPublisher(publisher);

        Publisher publisher1 = publisherDao.getPublisher(publisher.getId());

        assertEquals(publisher1, publisher);

        publisherDao.deletePublisher(publisher.getId());

        publisher1 = publisherDao.getPublisher(publisher.getId());

        assertNull(publisher1);
    }

    @Test
    public void getAllPublishers() {

        Publisher publisher = new Publisher();
        publisher.setName("");
        publisher.setStreet("");
        publisher.setCity("");
        publisher.setState("");
        publisher.setEmail("");
        publisher.setPhone("");
        publisher.setPostal_code("");

        publisher = publisherDao.addPublisher(publisher);

        Publisher publisher1 = new Publisher();
        publisher.setName("");
        publisher.setStreet("");
        publisher.setCity("");
        publisher.setState("");
        publisher.setEmail("");
        publisher.setPhone("");
        publisher.setPostal_code("");

        publisher1 = publisherDao.addPublisher(publisher1);

        List<Publisher> publisherList = publisherDao.getAllPublishers();

        assertEquals(publisherList.size(), 2);
    }

    @Test
    public void updatePublisher() {

        Publisher publisher = new Publisher();
        publisher.setName("");
        publisher.setStreet("");
        publisher.setCity("");
        publisher.setState("");
        publisher.setEmail("");
        publisher.setPhone("");
        publisher.setPostal_code("");

        publisher = publisherDao.addPublisher(publisher);

        publisherDao.updatePublisher(publisher);

        Publisher publisher1 = publisherDao.getPublisher(publisher.getId());
        assertEquals(publisher1, publisher);
    }
}
