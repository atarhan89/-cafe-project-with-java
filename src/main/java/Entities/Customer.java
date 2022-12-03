package Entities;

import Abstract.IEntities;

import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Concrete.StarbucksCustomerManager;

public class Customer implements IEntities {


    public Customer(String firstName, String lastName, String dateOfBirth, String nationalId) {
        FirstName = firstName;
        LastName = lastName;
        DateOfBirth = LocalDate.parse(dateOfBirth);
        NationalId = nationalId;


    }

    public String FirstName;
    public String LastName;


    public LocalDate DateOfBirth;
    public String NationalId;
    private static ICustomerCheckService CustomerCheckManager;

    public static void main(String[] args) throws Exception {





    }

}





