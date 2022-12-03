package Adapters;


import Abstract.ICustomerCheckService;
import Entities.Customer;
import jdk.jshell.spi.ExecutionControl;

public class MernisServiceAdapter implements ICustomerCheckService {
    @Override
    public boolean CheckİfRealPerson(Customer customer) throws ExecutionControl.NotImplementedException {
        return false;
    }

    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        if (customer.NationalId.length() == 11){
            return true;
        }
        else {
            return false;
        }

    }
}


