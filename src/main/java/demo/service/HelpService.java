package demo.service;

import demo.model.Customer;

import java.util.Collection;

/**
 * Created by nikhi_000 on 6/30/2015.
 */
public interface HelpService {
    void requestHelp(Customer customer);

    void cancelHelp(Customer customer);

    Collection<Customer> allRequestedHelp();

}
