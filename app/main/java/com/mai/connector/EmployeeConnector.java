package com.mai.connector;

import com.mai.model.Employee;
import com.mai.model.ListEmployee;

public class EmployeeConnector {
    public Employee login(String urs,String pwd)
    {
        ListEmployee le=new ListEmployee();
        le.generate_sample_dataset();
        for (Employee e : le.getEmployees())
        {
            if(e.getUsername().equalsIgnoreCase(urs) && e.getPassword().equals(pwd))
            {
                return e;
            }
        }
        return null;

    }
}
