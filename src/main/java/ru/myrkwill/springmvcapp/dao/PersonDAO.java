package ru.myrkwill.springmvcapp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.myrkwill.springmvcapp.models.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Mark Nagibin
 */
@Component
public class PersonDAO {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PersonDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Person> index() {
        return jdbcTemplate.query("select * from persontwo", new PersonWrapper());
    }

    public Person show(int id) {
        return jdbcTemplate.query("SELECT * FROM persontwo WHERE id=?", new Object[]{id}, new PersonWrapper())
                .stream().findAny().orElse(null);
    }

    public void save(Person person) {
         jdbcTemplate.update("INSERT INTO persontwo VALUES(1, ?, ?, ?)", person.getName(), person.getAge(), person.getEmail());
    }

    public void update(int id, Person updatedPerson) {
        jdbcTemplate.update("UPDATE persontwo SET first_name=?, age=?, email=? WHERE id=?",
                updatedPerson.getName(), updatedPerson.getAge(), updatedPerson.getEmail(), id);
    }

    public void delete(int id) {
        jdbcTemplate.update("DELETE FROM persontwo WHERE id=?", id);
    }
}
