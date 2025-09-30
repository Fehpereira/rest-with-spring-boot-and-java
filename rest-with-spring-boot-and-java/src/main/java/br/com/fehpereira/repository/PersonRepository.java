package br.com.fehpereira.repository;

import br.com.fehpereira.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {}
