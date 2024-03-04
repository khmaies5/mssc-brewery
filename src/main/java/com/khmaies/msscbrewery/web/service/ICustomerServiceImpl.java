package com.khmaies.msscbrewery.web.service;

import com.khmaies.msscbrewery.web.model.CustomerDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class ICustomerServiceImpl implements ICustomerService {
    @Override
    public CustomerDTO getCustomerById(UUID customerId) {
        return CustomerDTO.builder().id(UUID.randomUUID()).name("Khmaies").build();
    }

    @Override
    public CustomerDTO savedCustomer(CustomerDTO customerDTO) {
        return CustomerDTO.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDTO customerDTO) {
        //todo impl - add customer update
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting a customer...");

    }
}
