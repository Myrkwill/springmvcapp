package ru.myrkwill.springmvcapp.dao;

import org.springframework.jdbc.core.RowMapper;
import ru.myrkwill.springmvcapp.models.Person;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Mark Nagibin
 */
public class PersonWrapper implements RowMapper<Person> {

    @Override
    public Person mapRow(ResultSet resultSet, int i) throws SQLException {
        Person person = new Person();
        person.setId(resultSet.getInt("id"));
        person.setName(resultSet.getString("first_name"));
        person.setAge(resultSet.getInt("age"));
        person.setEmail(resultSet.getString("email"));
        return person;
    }

}
