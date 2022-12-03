package Abstract;

import Entities.Customer;

public interface ICustomerService {

    public default void Save(Customer customer) throws Exception {

    }

    void Save(ICustomerService customer);

    void Save();
}
