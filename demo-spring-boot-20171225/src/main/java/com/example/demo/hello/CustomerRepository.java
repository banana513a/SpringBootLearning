package com.example.demo.hello;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by zsmj on 2018/1/2.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}