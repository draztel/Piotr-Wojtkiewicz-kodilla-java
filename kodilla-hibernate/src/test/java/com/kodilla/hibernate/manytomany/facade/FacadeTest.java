package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTest {
    @Autowired
    private Facade facade;

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void findByThreeLettersTest() {
        //Given
        Employee employee1 = new Employee("Jan", "Kowalski");
        Employee employee2 = new Employee("Grzegorz", "Kowalski");
        Employee employee3 = new Employee("Ania", "Wanda");
        Company company1 = new Company("Software Machine");
        Company company2 = new Company("Data Matter");
        Company company3 = new Company("Grey Matter");

        //When
        company1.getEmployees().add(employee1);
        company2.getEmployees().add(employee2);
        company3.getEmployees().add(employee3);
        employee1.getCompanies().add(company1);
        employee2.getCompanies().add(company2);
        employee3.getCompanies().add(company3);
        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);
        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);
        List<Employee> employeesByThreeLetters = facade.findEmployeesByThreeLetters("ski");
        List<Company> companiesByThreeLetters = facade.findCompaniesByThreeLetters("ter");

        //Then
        Assert.assertEquals(2, employeesByThreeLetters.size());
        Assert.assertEquals(2, companiesByThreeLetters.size());

        try {
            companyDao.deleteById(company1.getId());
            companyDao.deleteById(company2.getId());
            companyDao.deleteById(company3.getId());
            employeeDao.deleteById(employee1.getId());
            employeeDao.deleteById(employee2.getId());
            employeeDao.deleteById(employee3.getId());
        } catch (Exception e) {
            //do nothing
        }
    }
}
