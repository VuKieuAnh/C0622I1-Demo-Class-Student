package controller;

import model.Classes;

import java.util.ArrayList;
import java.util.List;

public class ClassController {
    private String name;
    public static List<Classes> list = new ArrayList<>();

    static {
        list.add(new Classes("C0622I1", "Java Fulltime"));
        list.add(new Classes("C0722I1", "JS Fulltime"));
    }

    public void addNewClass(Classes classes){
        list.add(classes);
    }

    public void editClassById(int index, Classes classes){
        list.set(index, classes);
    }

    public ClassController() {
    }

    public ClassController(String name) {
        this.name = name;
    }

    public ClassController(String name, List<Classes> list) {
        this.name = name;
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Classes> getList() {
        return list;
    }

    public void setList(List<Classes> list) {
        this.list = list;
    }
}
