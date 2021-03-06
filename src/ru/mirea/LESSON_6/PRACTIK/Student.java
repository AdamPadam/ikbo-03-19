package ru.mirea.LESSON_6.PRACTIK;

public class Student {
    private int id;
    private int gpa;
    private String name;
    private String group;

    public Student() {
    }

    public Student(int id, int math, int rus, int inf, String name, String group) {
        this.id = id;
        this.gpa = math + rus + inf;
        this.name = name;
        this.group = group;
    }

    public Student(int id, int gpa, String name, String group) {
        this.id = id;
        this.gpa = gpa;
        this.name = name;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "{" +
                "gpa=" + gpa +
                ", " + name +
                '}';
    }
}
