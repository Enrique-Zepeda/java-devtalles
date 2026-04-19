package atributoStatic;

public class MainClassroom {
    public static void main(String[] args) {
        Classroom student1 = new Classroom("Kike");
        Classroom student2 = new Classroom("Zepeda");
        student1.showInfo();
        student2.showInfo();

        Classroom.setSchoolName("CUCS");
        student1.showInfo();
        student2.showInfo();


    }
}
