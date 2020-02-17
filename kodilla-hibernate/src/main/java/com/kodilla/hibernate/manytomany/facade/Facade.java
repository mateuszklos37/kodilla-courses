package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(Facade.class);

    public void findByPartOfName() throws FindByPartOfNameException{
        LOGGER.info("Starting method: Find-by-part-of-name");
        try{
            List<Company> companyFoundByPartOfName = companyDao.searchByPartOfName();
            if (companyFoundByPartOfName.size()>0){
                LOGGER.info("Found companies: ");
                for(Company tempCompany : companyFoundByPartOfName){
                    LOGGER.info(tempCompany.getName());
                }
            }
            else {
                LOGGER.info("Found none companies");
            }
            List<Employee> employeesFoundByPartOfLastname = employeeDao.searchByPartOfName();
            if (employeesFoundByPartOfLastname.size()>0){
                LOGGER.info("Found employees: ");
                for(Employee tempEmployee : employeesFoundByPartOfLastname){
                    LOGGER.info(tempEmployee.getLastname());
                }
            }
            else {
                LOGGER.info("Found none employees");
            }
        } finally{
            LOGGER.info("Method finished");
        }
    }

}
