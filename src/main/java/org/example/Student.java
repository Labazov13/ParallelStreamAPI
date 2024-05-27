package org.example;

import java.util.Map;

public class Student {
    private Map<String, Integer> grades;

    public Student(String name, Map<String, Integer> grades) {
        this.grades = grades;
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }
}
