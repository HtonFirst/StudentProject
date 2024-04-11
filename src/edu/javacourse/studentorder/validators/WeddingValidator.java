package edu.javacourse.studentorder.validators;

import edu.javacourse.studentorder.domain.AnswerWedding;
import edu.javacourse.studentorder.domain.StudentOrder;

public class WeddingValidator {

     public AnswerWedding checkWedding(StudentOrder so) {
        System.out.println("Wedding checking is running");
        AnswerWedding answerWedding = new AnswerWedding();
        return answerWedding;
    }
}