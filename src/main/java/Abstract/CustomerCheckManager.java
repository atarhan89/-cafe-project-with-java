package Abstract;

import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Entities.Customer;

public abstract class CustomerCheckManager implements ICustomerCheckService {
    @Override
    public boolean CheckİfRealPerson(Customer customer) {

        return true;
    }

    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        return false;
    }
}
