package oopexamplestudent;

public class Student {

    // All Attributes to be private
    private int rollno;
    private String name;
    private int age;
    private int marks;


    public Student() {
    }

    public Student(int rollno, String name, int age , int marks) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getmarks() {
        return marks;
    }

    public void setmarks(int marks) { this.marks = marks;  }


}

