package edu.javacourse.studentorder.validators;

import edu.javacourse.studentorder.domain.AnswerStudent;
import edu.javacourse.studentorder.domain.StudentOrder;

public class StudentValidator {
     public AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("Student checking is running");
        AnswerStudent answerStudent = new AnswerStudent();
        return answerStudent;

    }
}