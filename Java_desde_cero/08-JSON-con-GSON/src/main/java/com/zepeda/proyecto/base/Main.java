package com.zepeda.proyecto.base;

import com.google.gson.Gson;
import com.zepeda.proyecto.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("kike", 23, true);

        Gson gson = new Gson();

        String json = gson.toJson(person);

        System.out.println(json);

//        json = "{\"name\":\"kike\",\"age\":23,\"student\":true}";
        json = """
                {
                "name":"kike",
                "age":23,
                "student":true
                }
                """;

        Person person2 = gson.fromJson(json, Person.class);

        System.out.println(person2);
    }
}