package com.kodilla.optional.homework;

import com.kodilla.optional.Student;
import com.kodilla.optional.Teacher;
import com.kodilla.stream.homework.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Jan");
       List <Student> students = new ArrayList<>();
       students.add(new Student("Adam", null));
       students.add(new Student("Dominik", teacher));
       for (Student student :students){
           System.out.println(student.getName());
           System.out.println(student.getTeacher());
           Optional<Student> optionalStudent = Optional.ofNullable(student);

         Student  student1 = optionalStudent.orElse(new Student("",new Teacher("<undefined>")));
           System.out.println(student1);

}
    }
}
