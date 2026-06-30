package com.zepeda.proyecto.task;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zepeda.proyecto.Person;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class PersonaSaver {
    public static void main(String[] args) {
        Person person1 = new Person("Fernando", 30, true, Arrays.asList("correr", "Jugar", "Estudiar"));
        Person person2 = new Person("AMLO", 24, true, Arrays.asList("Caminar", "Gym", "Estudiar"));


        List<Person> people = Arrays.asList(person1, person2);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter("person.json")) {
            gson.toJson(people, writer);
            System.out.println("Lista de personas guardadas correctamente");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
