package utils;

import com.github.javafaker.DateAndTime;
import com.github.javafaker.Faker;

public class FakerControl {
    Faker dataFaker = new Faker();


    public String userName() {
        return dataFaker.name().name();}
    public String userFirstName() {
        return dataFaker.name().firstName();}
    public String userLastName() {
        return dataFaker.name().lastName();}
    public String email() {return dataFaker.internet().emailAddress();
    }
    public String currentAddress() {return dataFaker.address().fullAddress();
    }
    public String permanentAddress() {return dataFaker.address().secondaryAddress();
    }
    public int userAge() {
        return dataFaker.number().numberBetween(18, 90);}
    public int userSalary() {
        return dataFaker.number().numberBetween(500, 1000);}
    public String userDepartment() {
        return dataFaker.job().position();}
    public String userMobile(){return dataFaker.number().digits(10);
    }
    public String userSubjects(){return dataFaker.backToTheFuture().quote();
    }
    public String sign(){return dataFaker.letterify("?");}
    public int randomMonth(){return dataFaker.number().numberBetween(1,12);}
    public int randomYear(){return dataFaker.number().numberBetween(1980,2015);}
    public int randomDay(){return dataFaker.number().numberBetween(1,31);}
    public int randomO_hundredValue(){return dataFaker.number().numberBetween(0,100);}


}
