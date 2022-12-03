package Abstract;

import Entities.Customer;
import jdk.jshell.spi.ExecutionControl;

public interface ICustomerCheckService {

    public  boolean CheckİfRealPerson(Customer customer) throws ExecutionControl.NotImplementedException;

    boolean CheckIfRealPerson(Customer customer);
}
