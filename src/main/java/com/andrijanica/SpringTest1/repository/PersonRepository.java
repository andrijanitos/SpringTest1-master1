package com.andrijanica.SpringTest1.repository;

import com.andrijanica.SpringTest1.model.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Represents {@link Person} repository.
 */
public interface PersonRepository extends JpaRepository<Person, Long> {
}
