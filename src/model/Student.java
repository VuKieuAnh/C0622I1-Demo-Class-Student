package model;

public class Student {
    private String id;
    private String fullName;
    private int age;
    private Classes classes;


    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", classes=" + classes +
                '}';
    }

    public Student() {
    }

    public Student(String id, String fullName, int age, Classes classes) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.classes = classes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }
}
