package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {
    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    CompanyDao companyDao;

    public List<Employee> findEmployeesByThreeLetters(String lastname) {
        return employeeDao.findEmployeesByThreeLetters("%" + lastname + "%");
    }

    public List<Company> findCompaniesByThreeLetters(String name) {
        return companyDao.findCompaniesByThreeLetters("%" + name + "%");
    }
}
