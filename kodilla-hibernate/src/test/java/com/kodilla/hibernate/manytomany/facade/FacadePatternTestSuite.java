package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class FacadePatternTestSuite {
//
//    @Autowired
//    Facade facade;
//
//    @Autowired
//    CompanyDao companyDao;
//
//    @Autowired
//    EmployeeDao employeeDao;
//
//    @Test
//    public void shouldFindByPartOfName(){
//        //Given
//        Employee johnSmith = new Employee("John", "Smith");
//        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
//        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
//
//        Company softwareMachine = new Company("Software Machine");
//        Company dataMaesters = new Company("Data Maesters");
//        Company greyMatter = new Company("Grey Matter");
//        List<String> resultsList = new ArrayList<>();
//
//        companyDao.save(softwareMachine);
//        int softwareMachineId = softwareMachine.getId();
//
//        employeeDao.save(johnSmith);
//        int johnSmithId = johnSmith.getId();
//
//        employeeDao.save(stephanieClarckson);
//        int clarcksonId = stephanieClarckson.getId();
//
//        //When
//        try {
//            resultsList = facade.findByPartOfName();
//        } catch (FindByPartOfNameException e){
//        }
//
//        //Then
//        Assert.assertEquals(2, resultsList.size());
//
//        //CleanUp
//        companyDao.deleteById(softwareMachineId);
//        employeeDao.deleteById(johnSmithId);
//        employeeDao.deleteById(clarcksonId);
//    }
//
//    @Test
//    public void shouldntFindByPartOfName(){
//        //Given
//        Employee johnSmith = new Employee("John", "Smith");
//        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
//        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
//
//        Company softwareMachine = new Company("Software Machine");
//        Company dataMaesters = new Company("Data Maesters");
//        Company greyMatter = new Company("Grey Matter");
//        List<String> resultsList = new ArrayList<>();
//
//        companyDao.save(dataMaesters);
//        int dataMaestersId = dataMaesters.getId();
//
//        employeeDao.save(johnSmith);
//        int johnSmithId = johnSmith.getId();
//
//        //When
//        try {
//            resultsList = facade.findByPartOfName();
//        } catch (FindByPartOfNameException e){
//
//        }
//
//        //Then
//        Assert.assertEquals(0, resultsList.size());
//        //CleanUp
//        companyDao.deleteById(dataMaestersId);
//        employeeDao.deleteById(johnSmithId);
//    }
}