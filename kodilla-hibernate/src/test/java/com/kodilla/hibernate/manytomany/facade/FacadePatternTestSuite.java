package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadePatternTestSuite {

    @Autowired
    Facade facade;

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    private List<Integer> employeesId = new ArrayList<>();
    private List<Integer> companiesId = new ArrayList<>();

    @After
    public void deleteCreatedEmployees(){
        if(!employeesId.isEmpty()) {
            employeesId.forEach(id -> employeeDao.deleteById(id));
        }
        this.employeesId.clear();
    }

    @After
    public void deleteCreatedCompanies(){
        if(!companiesId.isEmpty()) {
            companiesId.forEach(id -> companyDao.deleteById(id));
        }
        this.companiesId.clear();
    }

    @Test
    public void shouldFindByPartOfName(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");
        List<String> resultsList = new ArrayList<>();

        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companiesId.add(softwareMachineId);

        employeeDao.save(johnSmith);
        int johnSmithId = johnSmith.getId();
        employeesId.add(johnSmithId);

        employeeDao.save(stephanieClarckson);
        int clarcksonId = stephanieClarckson.getId();
        employeesId.add(clarcksonId);

        //When
        try {
            resultsList = facade.findByPartOfName();
        } catch (FindByPartOfNameException e){
        }

        //Then
        Assert.assertEquals(2, resultsList.size());
    }

    @Test
    public void shouldntFindByPartOfName(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");
        List<String> resultsList = new ArrayList<>();

        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companiesId.add(dataMaestersId);

        employeeDao.save(johnSmith);
        int johnSmithId = johnSmith.getId();
        employeesId.add(johnSmithId);

        //When
        try {
            resultsList = facade.findByPartOfName();
        } catch (FindByPartOfNameException e){

        }
        //Then
        Assert.assertEquals(0, resultsList.size());
    }
}