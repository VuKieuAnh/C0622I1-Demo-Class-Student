package controller;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentController {
    private String name;
    public static List<Student> studentList = new ArrayList<>();

    public void addNewStudent(Student student){
        studentList.add(student);
    }

    public StudentController(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
