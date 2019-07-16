package com.company.KaleighHeroldU1M5Summative.dao;

import com.company.KaleighHeroldU1M5Summative.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class AuthorDaoJdbcTemplateImpl implements AuthorDao {
    private JdbcTemplate jdbcTemplate;

    // Prepared statements
    private static final String INSERT_AUTHOR_SQL =
            "insert into author (first_name, last_name, street, city, state, postal_code, phone, email) values(?, ?, ?, ?, ?, ?, ?, ?)";

    private static final String SELECT_AUTHOR_SQL =
            "select * from author where id = ?";

    private static final String SELECT_ALL_AUTHORS_SQL =
            "select * from artist";

    private static final String UPDATE_AUTHOR_SQL =
            "update author set first_name = ?, last_name, street, city, state, postal_code, phone, email where id = ?";

    private static final String DELETE_AUTHOR_SQL =
            "delete from author where id = ?";

    @Autowired
    public AuthorDaoJdbcTemplateImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    @Transactional
    public Author addAuthor(Author author) {
        jdbcTemplate.update(INSERT_AUTHOR_SQL, author.getFirst_name(),
                author.getLast_name(),
                author.getStreet(),
                author.getCity(),
                author.getState(),
                author.getPostal_code(),
                author.getPhone(),
                author.getEmail());

        int id = jdbcTemplate.queryForObject("select LAST_INSERT_ID()", Integer.class);

        author.setId(id);

        return author;
    }

    @Override
    public Author getAuthor(int id) {

        try {
            return jdbcTemplate.queryForObject(SELECT_AUTHOR_SQL, this::mapRowToAuthor, id);
        } catch (EmptyResultDataAccessException e) {
            // if there is no match for this author ID, return null
            return null;
        }

    }

    @Override
    public List<Author> getAllAuthors() {

        return jdbcTemplate.query(SELECT_ALL_AUTHORS_SQL, this::mapRowToAuthor);

    }

    @Override
    public void updateAuthor(Author author) {

        jdbcTemplate.update(
                UPDATE_AUTHOR_SQL,
                author.getFirst_name(),
                author.getLast_name(),
                author.getStreet(),
                author.getCity(),
                author.getState(),
                author.getPostal_code(),
                author.getPhone(),
                author.getEmail());

    }

    @Override
    public void deleteAuthor(int id) {

        jdbcTemplate.update(DELETE_AUTHOR_SQL, id);

    }

    private Author mapRowToAuthor(ResultSet rs, int rowNum) throws SQLException {
        Author author = new Author();
        author.setId(rs.getInt("author_id"));
        author.setFirst_name(rs.getString("First_name"));
        author.setLast_name(rs.getString("Last_name"));
        author.setStreet(rs.getString("street"));
        author.setCity(rs.getString("city"));
        author.setState(rs.getString("state"));
        author.setPostal_code(rs.getString("Postal_code"));
//        author.getPhone(rs.getString("phone"));
        author.setEmail(rs.getString("email"));

        return author;
    }
}
