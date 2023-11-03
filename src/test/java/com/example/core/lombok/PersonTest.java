package com.example.core.lombok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void lombokTest() {
        Person person = new Person();
        person.setName("김철수");
        person.setAge(30);

        String name = person.getName();

        System.out.println("Person = " + person);

        new Person("박영희",33);
    }

}