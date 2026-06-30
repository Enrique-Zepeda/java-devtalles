package com.zepeda.proyect;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Person {
    String name;
    int age;
    String lastName;

}
