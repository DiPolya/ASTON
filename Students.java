package org.example;

import java.util.List;

public class Students {
    private String name;
    private String group;
    private int course;
    private List <Integer> grades;

    public Students (String name, String group, int course, List<Integer> grades){
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName(){
        return name;
    }

    public String getGroup(){
        return group;
    }

    public int getCourse(){
        return course;
    }

    public void setCourse (int course){
        this.course = course;
    }

    public List<Integer> getGrades(){
        return grades;
    }

    public double getAverageGrade(){
        return grades.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    public void promoteStudents(){
        if (getAverageGrade() >= 3.0){
            this.course++;
        }
    }
}
