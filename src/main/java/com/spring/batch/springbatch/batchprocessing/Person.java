package com.spring.batch.springbatch.batchprocessing;

import java.util.Date;

public class Person {
    private String lastName;
    private String firstName;
    private String birthday;
    private Integer age;
    public Person() {
    }

    public Person(String firstName, String lastName, String birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.age = 0;
    }

    public Person(String firstName, String lastName, String birthday, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "firstName: " + firstName + ", lastName: " + lastName + ", age: " + age.toString();
    }

}