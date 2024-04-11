package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.*;
import edu.javacourse.studentorder.exception.CityRegisterException;
import edu.javacourse.studentorder.mail.MailSender;
import edu.javacourse.studentorder.validators.ChildrenValidator;
import edu.javacourse.studentorder.validators.CityRegisterValidator;
import edu.javacourse.studentorder.validators.StudentValidator;
import edu.javacourse.studentorder.validators.WeddingValidator;

public class StudentOrderValidator {

    private CityRegisterValidator cityRegVal;
    private WeddingValidator weddingVal;
    private ChildrenValidator childrenVal;
    private StudentValidator studentVal;
    private MailSender mailSender;

    public StudentOrderValidator(){
         cityRegVal = new CityRegisterValidator();
//         weddingVal = new WeddingValidator();
//         childrenVal = new ChildrenValidator();
//         studentVal = new StudentValidator();
//         mailSender = new MailSender();

    }



    public static void main(String[] args) throws CityRegisterException {
        StudentOrderValidator sov = new StudentOrderValidator();
        sov.checkingAll();



    }
      public void checkingAll() throws CityRegisterException {
        StudentOrder[] soArray = readStudentOrders();

//          for (int c = 0; c < soArray.length; c++) {
//              System.out.println();
//              checkOneOrder(soArray[c]);
//          }

          for (StudentOrder so : soArray) {
              System.out.println();
               checkOneOrder(so);
          }
      }

            StudentOrder[] so = readStudentOrders();

            public void checkOneOrder(StudentOrder so) throws CityRegisterException {
             AnswerCityRegister cityAnswer = checkCityRegister(so);
             AnswerWedding answerWedding = checkWedding(so);
             AnswerChildren childrenAnswer = checkChildren(so);
             AnswerStudent answerStudent = checkStudent(so);
             sendEmail(so);
         }






    public StudentOrder[] readStudentOrders(){
        StudentOrder[] soArray = new StudentOrder[3];

        for (int c = 0; c < soArray.length; c++) {
            soArray[c] = SaveStudentOrder.buildStudentOrder(c);

        }

        return soArray;
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so) throws CityRegisterException {
        return cityRegVal.checkCityRegister(so);
    }

    public AnswerWedding checkWedding(StudentOrder so){
        return weddingVal.checkWedding(so);
    }

    public AnswerChildren checkChildren(StudentOrder so){
        return childrenVal.checkChildren(so);
    }

    public AnswerStudent checkStudent(StudentOrder so){
        return studentVal.checkStudent(so);
    }

    public void sendEmail(StudentOrder so){
        mailSender.sendEmail(so);
    }

}
