package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;

import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;

import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Service
public class SearchFacade {


    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;


    public List<Company> searchCompany(final String letters) throws SearchFacadeException {
        List<Company> companySearch = companyDao.retrieveCompanyNameWithFirstLetters(letters);
        if (companySearch.size() == 0) {
            LOGGER.info(SearchFacadeException.ERR_COMPANY_NOT_FOUND);
            throw new SearchFacadeException(SearchFacadeException.ERR_COMPANY_NOT_FOUND);
        } else {
            return companySearch;
        }
    }

    public List<Employee> searchEmployee(final String name) throws SearchFacadeException {
        List<Employee> employeeSearch = employeeDao.retrieveName(name);
        if (employeeSearch.size() == 0) {
            LOGGER.info(SearchFacadeException.ERR_EMPLOYEE_NOT_FOUND);
            throw new SearchFacadeException(SearchFacadeException.ERR_EMPLOYEE_NOT_FOUND);
        } else {
            return employeeSearch;
        }
    }
}


