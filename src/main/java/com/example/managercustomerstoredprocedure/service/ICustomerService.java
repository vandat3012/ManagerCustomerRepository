package com.example.managercustomerstoredprocedure.service;

import com.example.managercustomerstoredprocedure.model.Customer;

public interface ICustomerService {
    boolean saveWithStoredProcedure(Customer customer);
}
