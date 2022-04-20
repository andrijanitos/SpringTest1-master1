package com.andrijanica.SpringTest1.service.personService;

import com.andrijanica.SpringTest1.exception.ResourceNotFoundException;
import com.andrijanica.SpringTest1.model.entity.Person;
import com.andrijanica.SpringTest1.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Override
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    @Override
    public Person getPersonById(Long id) {
        Optional<Person> person = personRepository.findById(id);

        if (person.isEmpty()) {
            throw new ResourceNotFoundException("Person with id=" + id + " not found!");
        }

        return person.get();
    }
}
