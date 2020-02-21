package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }
    @Test
    public void testQueries(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();

        employeeDao.save(johnSmith);
        int johnSmithId = johnSmith.getId();

        employeeDao.save(stephanieClarckson);
        int clarcksonId = stephanieClarckson.getId();

        //When
        List<Company> companiesStartingWith = companyDao.searchCompaniesStartingWith("Sof");
        List<Employee> employeesWithNameSmith = employeeDao.searchByLastname("Smith");
        List<Employee> employeesWithNameKlos = employeeDao.searchByLastname("Klos");
        List<Company> companyFoundByPartOfName = companyDao.searchByPartOfName();
        for (Company company: companyFoundByPartOfName){
            System.out.println(company.getName());
        }
        List<Employee> employeesFoundByPartOfLastname = employeeDao.searchByPartOfName();
        for (Employee employee: employeesFoundByPartOfLastname){
            System.out.println(employee.getLastname() + employee.getFirstname());
        }
        //Then
        Assert.assertEquals(1, companiesStartingWith.size());
        Assert.assertEquals(1, employeesWithNameSmith.size());
        Assert.assertEquals(0, employeesWithNameKlos.size());

//        //CleanUp
        companyDao.deleteById(softwareMachineId);
        employeeDao.deleteById(johnSmithId);
        employeeDao.deleteById(clarcksonId);
    }
}
