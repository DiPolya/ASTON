package org.example;

import java.util.Iterator;
import java.util.Set;

public class StudentsUtils {

    //Метод удаляет студентов со средним баллом меньше 3
    static void removeStudentsLowGrade (Set<Students> students){
        Iterator<Students> iterator = students.iterator();
        while (iterator.hasNext()){
            Students s = iterator.next();
            if (s.getAverageGrade() < 3.0){
                iterator.remove();
            }
        }
    }

    // Метод переводит студентов на следующий курс, если средний балл оценки больше 3
    static void promoteStudents (Set<Students> students){
        for (Students s : students){
            s.promoteStudents();
        }
    }

    //Метод получает список студентов и номер курса
    static void printStudents(Set<Students> students, int course){
        for (Students s : students){
            if (s.getCourse() == course) {
                System.out.println(s.getName());
            }
        }
    }
}
