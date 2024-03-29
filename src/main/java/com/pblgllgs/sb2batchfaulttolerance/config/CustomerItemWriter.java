package com.pblgllgs.sb2batchfaulttolerance.config;

import com.pblgllgs.sb2batchfaulttolerance.entity.Customer;
import com.pblgllgs.sb2batchfaulttolerance.repository.CustomerRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerItemWriter implements ItemWriter<Customer> {

    @Autowired
    private CustomerRepository repository;

    @Override
    public void write(List<? extends Customer> list) throws Exception {
        System.out.println("Writer Thread "+Thread.currentThread().getName());
        repository.saveAll(list);
    }
}
