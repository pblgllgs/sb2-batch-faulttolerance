package com.pblgllgs.sb2batchfaulttolerance.repository;

import com.pblgllgs.sb2batchfaulttolerance.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
