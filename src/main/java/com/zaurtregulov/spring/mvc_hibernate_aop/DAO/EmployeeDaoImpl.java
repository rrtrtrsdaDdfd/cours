package com.zaurtregulov.spring.mvc_hibernate_aop.DAO;

import com.zaurtregulov.spring.mvc_hibernate_aop.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    @Transactional
    public List<Employee> employeeList() {
        Session session=sessionFactory.getCurrentSession();
        List<Employee> employees=session.createQuery("from Employee",Employee.class).getResultList();

        return null;
    }
}
