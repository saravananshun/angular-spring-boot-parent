package com.saro.study.springrest.mysql.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.saro.study.springrest.mysql.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	List<Customer> findByAge(int age);
}
