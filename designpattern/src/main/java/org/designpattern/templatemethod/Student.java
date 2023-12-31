package org.designpattern.templatemethod;

public class Student implements Comparable{
    private String name;
    private Grade grade;

    public Student(String name, Grade grade){
        this.name = name;
        this.grade = grade;
    }

    @Override
    public int compareTo(Object o) {
        Student other = (Student) o;
        if(this.grade.ordinal() < other.grade.ordinal()){
            return 1;
        } else if (this.grade.ordinal() == other.grade.ordinal()) {
            return 0;
        }else return -1;
    }

    @Override
    public String toString() {
        return name + " " + grade.name();
    }
}
