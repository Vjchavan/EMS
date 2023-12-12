package com.ems.service;

import com.ems.entity.Employee;
import com.ems.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {

    @Autowired
    private EmpRepo repo;

    public void addEmp(Employee emp){
        repo.save(emp);
    }

}
