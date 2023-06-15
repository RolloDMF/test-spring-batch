package com.spring.batch.springbatch.batchprocessing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.batch.item.ItemProcessor;
import java.util.Date;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {

    private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

    @Override
    public Person process(Person person) throws Exception {
        final String firstName = person.getFirstName().toUpperCase();
        final String lastName = person.getLastName().toUpperCase();
        final String birthday = person.getBirthday();
        person.setAge(0);

        Integer age = getPersonAge(birthday);

        final Person transformedPerson = new Person(firstName, lastName, birthday, age);

        log.info("Converting (" + person + ") into (" + transformedPerson + ")");

        return transformedPerson;
    }

    private static Integer getPersonAge(String birthday) throws ParseException {
        Date now = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dateOfBirthday = simpleDateFormat.parse(birthday);
        return now.getYear() - dateOfBirthday.getYear();
    }
}