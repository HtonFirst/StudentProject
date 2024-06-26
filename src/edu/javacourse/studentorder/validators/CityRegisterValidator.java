package edu.javacourse.studentorder.validators;

import edu.javacourse.studentorder.domain.AnswerCityRegister;
import edu.javacourse.studentorder.domain.StudentOrder;
import edu.javacourse.studentorder.exception.CityRegisterException;
import org.w3c.dom.ls.LSOutput;

public class CityRegisterValidator {

    public String hostName;
    protected int port;
    private String login;
    String password;

    private CityRegisterChecker personChecker;
    public CityRegisterValidator() {
        personChecker = new FakeCityRegisterChecker();
    }

     public AnswerCityRegister checkCityRegister(StudentOrder so)  {
        try {
           CityRegisterCheckerResponse hans = personChecker.checkPerson(so.getHusband());
           CityRegisterCheckerResponse wans = personChecker.checkPerson(so.getWife());
           CityRegisterCheckerResponse cans = personChecker.checkPerson(so.getChild());
        } catch (CityRegisterException ex) {
            ex.printStackTrace(System.out);
        }
        AnswerCityRegister ans = new AnswerCityRegister();
        return ans;
    }

}
