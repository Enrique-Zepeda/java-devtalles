package Proyecto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentRegistrationSystem {

    private List<Student> students;

    public StudentRegistrationSystem() {
        this.students = new ArrayList<>();
    }

    public void registerStudent(String name, int age, String id) throws DuplicateStudentException {
        validateStudentData(name, age, id);
        if (isStudentRegister(id)) throw new DuplicateStudentException("El estudiante ya existe");

        this.students.add(new Student(name, age, id));
        System.out.println("Usuario registrado");
    }

    public boolean isStudentRegister(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) return true;
        }
        return false;
    }

    public void removeStudent(String id) throws StudentNotFoundException {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("EL id no puede estar vacio");
        }

        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getId().equals(id)) {
                iterator.remove();
                System.out.println("Estudiante eliminado");
                return;
            }

        }
        throw new StudentNotFoundException("El estudiante no existe");
    }

    public void validateStudentData(String name, int age, String id) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("EL nombre no puede estar vacio");
        }
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("EL id no puede estar vacio");
        }
        if (age < 17 || age > 100) {
            throw new IllegalArgumentException("La edad tiene que estar entre 17 y 100");
        }

        if (!id.matches("^[A-Z]\\d{5}$")) {
            throw new IllegalArgumentException("El id no cumple con un id de estudiante");
        }

    }

    public static void main(String[] args) {
        StudentRegistrationSystem system = new StudentRegistrationSystem();

        try {
            system.registerStudent("Kike", 23, "A12345");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            system.registerStudent("Enrique Zepeda", 25, "A12345");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            system.registerStudent("Gabriel", 12, "A12125");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            system.registerStudent("Pepe", 33, "112125");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            system.registerStudent("Juan", 33, "A12225");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            system.removeStudent("243141");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            system.removeStudent("A12345");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
