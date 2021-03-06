package com.kevin.demodependency.dao;

import com.kevin.demodependency.entity.Person;

import java.util.Date;
import java.util.List;

//@Repository
public interface PersonDAL {
    Person savePerson(Person person);
    List<Person> getAllPerson();
    List<Person> getAllPersonPaginated(
            int pageNumber, int pageSize);
    Person findOneByName(String name);
    List<Person> findByName(String name);
    List<Person> findByBirthDateAfter(Date date);
    List<Person> findByAgeRange(int lowerBound, int upperBound);
    List<Person> findByFavoriteBooks(String favoriteBook);
    void updateMultiplePersonAge();
    Person updateOnePerson(Person person);
    void deletePerson(Person person);
}