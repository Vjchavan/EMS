package com.ems.service;

import com.ems.entity.Employee;
import com.ems.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpService {

    @Autowired
    private EmpRepo repo;

    public void addEmp(Employee emp){
        repo.save(emp);
    }

    public List<Employee> getAllEmp(){
        return repo.findAll();
    }

    public Optional<Employee> getEmpById(int id){
        return repo.findById(id);
    }

}
