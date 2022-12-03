package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Entities.Customer;
import jdk.jshell.spi.ExecutionControl;

public class StarbucksCustomerManager extends BaseCustomerManager implements ICustomerCheckService {

    public ICustomerCheckService  _customerCheckService;

    public StarbucksCustomerManager(ICustomerCheckService customerCheckService){
        _customerCheckService = customerCheckService;

    }

    @Override
    public void Save(Customer customer) throws Exception {

        if (_customerCheckService.CheckİfRealPerson(customer)){
            super.Save(customer);
        }
        else{throw new Exception("not a valid person");}
    }
    @Override
    public boolean CheckİfRealPerson(Customer customer) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("");
    }

    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        return false;
    }
}
