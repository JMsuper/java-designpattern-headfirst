package org.designpattern.templatemethod;

import java.util.Arrays;

public class TemplateMethodRunner {
    public static void main(String[] args) {
        Student s1 = new Student("s1",Grade.MIDDLE);
        Student s2 = new Student("s2",Grade.MIDDLE);
        Student s3 = new Student("s3",Grade.ELEMENTARY);
        Student s4 = new Student("s4",Grade.MASTER);

        Student[] students = new Student[]{s1,s2,s3,s4};
        for (Student s : students) System.out.println(s);

        System.out.println();
        Arrays.sort(students);
        for (Student s : students) System.out.println(s);
    }
}
