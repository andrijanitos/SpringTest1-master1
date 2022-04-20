package com.andrijanica.SpringTest1.service.personService;

import com.andrijanica.SpringTest1.model.entity.Person;

import java.util.List;

/**
 * Service for {@link Person} operations.
 */
public interface PersonService {

    /**
     * Gets all persons.
     *
     * @return List of all persons.
     */
    List<Person> getAllPersons();

    /**
     * Gets person by id.
     *
     * @param id Id.
     * @return Person is exists, otherwise null.
     */
    Person getPersonById(Long id);
}
