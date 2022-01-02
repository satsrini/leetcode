package com.heapdump3;

import java.util.List;
import java.util.ArrayList;


public class StudentUtil
{

    private List<Student> students;

    public static void main(String[] args)
    {
       
        StudentUtil su = new StudentUtil();
        //su.loadStudents();

        System.out.println("CREATING STUDENTS 123");

        Student prevstu1 = null;        
        Student currstu1 = null;

        while(true)
        {
           prevstu1 = currstu1;
           currstu1 = su.createStudent(null,0);
           su.students.add(currstu1);
           su.students.remove(prevstu1);
        }

    }

    public StudentUtil()
    {

      students = new ArrayList<>();

    }

    private void loadStudents()
    {
      System.out.println("Loading STUDENTS");
      Student stu = null;

      while(true)
      {
         stu = new Student(null, 0);
         students.add(stu);
      }


    }

    private Student createStudent(String name, int age)
    {
       Student st = new Student(name,age);
       return st;
    }

}
