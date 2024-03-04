package com.example.managercustomerstoredprocedure.repository;

import com.example.managercustomerstoredprocedure.model.Customer;

public interface ICustomerRepository {
    boolean saveWithStoredProcedure (Customer customer);
}
