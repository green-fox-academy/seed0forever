package com.greenfox.seed0forever.comparatortask.greenfoxorg;

import java.util.ArrayList;
import java.util.List;

public class LagopusClass {

  String className;
  List<Student> students;
  List<Mentor> mentors;

  public LagopusClass(String className) {
    this.className = className;
    students = new ArrayList<>();
    mentors = new ArrayList<>();
  }

  void addStudent(Student student) {
    students.add(student);
  }

  void addMentor(Mentor mentor) {
    mentors.add(mentor);
  }

  void info() {
    System.out.println(
            "Lagopus " + className + " class has " + students.size() + " students and " + mentors
                    .size() + " mentors.");
  }

}
