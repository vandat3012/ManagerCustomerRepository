package com.example.managercustomerstoredprocedure.service;

import com.example.managercustomerstoredprocedure.model.Customer;
import com.example.managercustomerstoredprocedure.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements  ICustomerService{
    @Autowired
    private ICustomerRepository iCustomerRepository;
    @Override
    public boolean saveWithStoredProcedure(Customer customer) {
        return iCustomerRepository.saveWithStoredProcedure(customer);
    }
}
