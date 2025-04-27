package org.example;
import java.util.HashSet;
import java.util.Set;
import java.util.HashSet;

class Student {
    String name;
    String group;
    int course;
    double grades;

    Student(String name, String group, int course, double grades){
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }
}

public class Main {

    //Метод удаляет студентов со средним баллом меньше 3
    static void removeStudentsLowGrade(Set<Student> students){
        students.removeIf (s ->s.grades < 3);
    }

    // Метод переводит студентов на следующий курс, если средний балл оценки больше 3
    static void promoteStudents (Set<Student> students){
        for (Student s : students ){
            if (s.grades >=3 ){
                s.course++;
            }
        }
    }

    //Метод получает список студентов и номер курса
    static void printStudents(Set<Student> students, int course){
        for (Student s : students ){
            if (s.course == course){
                System.out.println(s.name);
            }
        }
    }

    public static void main (String[] args ){
        Set<Student> students = new HashSet<>();
        students.add(new Student ("Шелдон","ФМ",2, 5.0));
        students.add(new Student ("Леонард","ФЭ",2, 3.9));
        students.add(new Student ("Говард","ИН",3, 2.8));
        students.add(new Student ("Раджеш","АС",2, 4.5));
        students.add(new Student ("Пенни","Т",1, 2.4));

        removeStudentsLowGrade(students);
        promoteStudents(students);

        System.out.println("Студенты после проверки среднего балла: ");
        for (Student s : students){
            System.out.println(s.name + " на " + s.course + " курсе, средний балл: " + s.grades );
        }

        System.out.println("\nСтуденты 3 курса: ");
        printStudents(students, 3);
    }

}