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
public class SearchFacadeTestSuite {


    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private  EmployeeDao employeeDao;

    @Autowired
    private SearchFacade searchFacade;


    @Test
    public void searchCompaniesByNameTest() throws SearchFacadeException {


        // Given
        Company company = new Company("Kodilla company");
        Company company1 = new Company("Google");
        Company company2 = new Company("Facebook");

        // When
        companyDao.save(company);
        companyDao.save(company1);
        companyDao.save(company2);
        List<Company> result = searchFacade.searchCompany("Fac");


        // Then
        Assert.assertEquals(1, result.size());
        companyDao.delete(company);
        companyDao.delete(company1);
        companyDao.delete(company2);
    }

    @Test
    public void searchUsersByNameTest() throws SearchFacadeException {


        // Given
        Employee employee = new Employee("Konrad", "Smuga" );
        Employee employee1 = new Employee("Katarzyna", "Kowalska");
        Employee employee2 = new Employee("Anna", "Blaszczyk");

        // When

        employeeDao.save(employee);
        employeeDao.save(employee1);
        employeeDao.save(employee2);
        List<Employee> result = searchFacade.searchEmployee("Smu");

        // Then
       Assert.assertEquals(1, result.size());
       employeeDao.delete(employee);
        employeeDao.delete(employee1);
        employeeDao.delete(employee2);
}
}
