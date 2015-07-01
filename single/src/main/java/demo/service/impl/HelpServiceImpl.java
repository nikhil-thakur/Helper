package demo.service.impl;

import demo.Dao.CustomerRepository;
import demo.model.Customer;
import demo.service.HelpService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

/**
 * Created by nikhi_000 on 6/30/2015.
 */
public class HelpServiceImpl implements HelpService {
    @Autowired
    CustomerRepository customerRepository;

    public void requestHelp(Customer customer) {
        customerRepository.save(customer);
    }

    public void cancelHelp(Customer customer) {
        customerRepository.delete(customer);
    }

    public Collection<Customer> allRequestedHelp() {
        return customerRepository.findAll();
    }

}
