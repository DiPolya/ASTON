package org.example;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main (String[] args ){
        Set<Students> students = new HashSet<>();
        students.add(new Students ("Шелдон","ФМ",2, Arrays.asList(5,5,5,5,5)));
        students.add(new Students ("Леонард","ФЭ",2, Arrays.asList(4,4,5,5,4)));
        students.add(new Students ("Говард","ИН",2, Arrays.asList(3,4,3,2,3)));
        students.add(new Students ("Раджеш","АС",2, Arrays.asList(4,5,5,5,4)));
        students.add(new Students ("Пенни","Т",2, Arrays.asList(2,3,2,4,3)));


        System.out.println("Студенты 2 курса: ");
        StudentsUtils.printStudents(students, 2);

        StudentsUtils.removeStudentsLowGrade(students);
        StudentsUtils.promoteStudents(students);

        System.out.println("\nСтуденты 3 курса после проверки среднего балла: ");
        StudentsUtils.printStudents (students, 3) ;
    }

}