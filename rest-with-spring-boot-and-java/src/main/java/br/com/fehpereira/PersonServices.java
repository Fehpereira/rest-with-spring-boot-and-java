package br.com.fehpereira;

import br.com.fehpereira.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

 private final AtomicLong counter =  new AtomicLong();
 private Logger logger = Logger.getLogger(PersonServices.class.getName());

 public Person findById(String id){
     logger.info("Finding a Person");

     Person person = new Person();
     person.setId(counter.incrementAndGet());
     person.setFirstName("Leandro");
     person.setLastName("Costa");
     person.setAddress("Uberlândia - Minas Gerais - Brasil");
     person.setGender("Male");
     return person;

 }

}
