package edu.javacourse.studentorder.validators;

import edu.javacourse.studentorder.domain.AnswerChildren;
import edu.javacourse.studentorder.domain.StudentOrder;

public class ChildrenValidator {

    public static AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("Children checking is running");
        AnswerChildren answerChildren = new AnswerChildren();
        return answerChildren;
    }
}