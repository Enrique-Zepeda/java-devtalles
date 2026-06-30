package com.zepeda.proyecto.task;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zepeda.proyecto.Person;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;


public class PersonLoader {

    public static void main(String[] args) {
        Gson gson = new Gson();
        Type listType = new TypeToken<List<Person>>() {
        }.getType();

        try (FileReader reader = new FileReader("person.json")) {
            List<Person> people = gson.fromJson(reader, listType);
            for (Person person : people) {
                System.out.println("Nombre: " + person.getName());
                System.out.println("Edad: " + person.getAge());
                System.out.println("Is Student: " + person.isStudent());
                System.out.println("Hobbies: " + person.getHobbies());
                System.out.println("=================");

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
