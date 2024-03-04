package com.khmaies.msscbrewery.web.service;

import com.khmaies.msscbrewery.web.model.CustomerDTO;

import java.util.UUID;

public interface ICustomerService {

    CustomerDTO getCustomerById(UUID customerId);

    CustomerDTO savedCustomer(CustomerDTO customerDTO);

    void updateCustomer(UUID customerId, CustomerDTO customerDTO);

    void deleteById(UUID customerId);
}
