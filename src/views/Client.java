package views;

import controller.ClassController;
import controller.StudentController;
import model.Classes;
import model.Student;

import java.util.List;
import java.util.Scanner;

public class Client {
    private static List<Classes> classesList = ClassController.list;
    public static void main(String[] args) {
        ClassController diep = new ClassController("Diep");
        StudentController ka = new StudentController("KA");


        Student student = createNewStudent();
        ka.addNewStudent(student);
        System.out.println(StudentController.studentList);

    }

    private static Student createNewStudent() {
        Student student = null;
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Scanner scanner1 = new Scanner(System.in);
        String id = scanner1.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        int age = scanner2.nextInt();

        Scanner scanner3 = new Scanner(System.in);
        String nameClass = scanner3.nextLine();
        boolean check = false;
        Classes classes = null;

        for (int i = 0; i < classesList.size(); i++) {
            if (classesList.get(i).getId().equals(nameClass)){
                check = true;
                classes = classesList.get(i);
            }
        }
        if (check) {
           student = new Student(id, name, age, classes);
        }
        return  student;
    }
}
