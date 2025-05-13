package com.mai.model;

import java.util.ArrayList;
import java.util.List;

public class ListEmployee {
    private List<Employee> employees;

    public ListEmployee() {
        employees=new ArrayList<>();
    }

    public List<Employee> getEmployees() {
        return employees;
    }
    public void generate_sample_dataset()
    {
        Employee e1=new Employee();
        e1.setName("John");
        e1.setEmail("Jonh@gmail.com");
        e1.setUsername("John");
        e1.setPassword("123");
        employees.add(e1);


        Employee e2=new Employee();
        e2.setName("Linda");
        e2.setEmail("Linda@gmail.com");
        e2.setUsername("Linda");
        e2.setPassword("222");
        employees.add(e2);


        Employee e3=new Employee();
        e3.setName("Peter");
        e3.setEmail("Peter@gmail.com");
        e3.setUsername("Peter");
        e3.setPassword("678");
        employees.add(e3);
    }
}
