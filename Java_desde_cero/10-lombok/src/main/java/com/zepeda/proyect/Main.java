package com.zepeda.proyect;


public class Main {
    public static void main(String[] args) {
        Person person = Person.builder().name("Gabriel").age(22).lastName("Chaldú").build();
        System.out.println(person);
    }
}