package com.zepeda.proyecto.files;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zepeda.proyecto.Person;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JsonWritenReaderList {
    public static void main(String[] args) {
        Person person = new Person("kike", 23, true);

        Gson gson = new Gson();
        List<Person> people = new ArrayList<>();
        try (FileReader reader = new FileReader("person.json")) {
            Type listType = new TypeToken<List<Person>>() {
            }.getType();
            people = gson.fromJson(reader, listType);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        for (Person person1 : people) {
            System.out.println("Name: " + person1.getName());
            System.out.println("Age: " + person1.getAge());
            System.out.println("Is Student: " + person1.isStudent());
            System.out.println("===================================");
        }

        people.add(new Person("Pep", 33, false));

        try (FileWriter writer = new FileWriter("person.json")) {
            gson.toJson(people, writer);
            System.out.println("La persona fue guardada con exito");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (FileReader reader = new FileReader("person.json")) {
            Type listType = new TypeToken<List<Person>>() {
            }.getType();
            people = gson.fromJson(reader, listType);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        for (Person person1 : people) {
            System.out.println("Name: " + person1.getName());
            System.out.println("Age: " + person1.getAge());
            System.out.println("Is Student: " + person1.isStudent());
            System.out.println("===================================");
        }

    }
}
