package com.divagar.junit.Services;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divagar.junit.Models.Employee;
import com.divagar.junit.Repositories.EmployeeRepository;

@Service
public class EmployeeService{
    private static final Logger logger=LoggerFactory.getLogger(EmployeeService.class);

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee){
        logger.info("Going to save an employee");
        Employee savedEmployee=employeeRepository.save(employee);
        logger.info("Employee with the ID {} saved successfully",employee.getEmployeeId());
        return savedEmployee;
    }

    public Employee getEmployeeById(Integer id){
        logger.info("Retrieving the employee with the Id {} ",id);
        Employee retrievedEmployee=employeeRepository.findById(id).orElse(null);
        if(retrievedEmployee != null){
            logger.info("Employee retrieved");
        }else{
            logger.warn("Employee not found with the Id {} ",id);
        }
        return retrievedEmployee;
    }

    public List<Employee> getAllEmployees(){
        logger.info("Retriving all the employees from the DB");
        List<Employee> list=employeeRepository.findAll();
        if(list.size()==0){
            logger.warn("There is no employees in the database");
        }else{
            logger.info("There are {} employees in the db",list.size());
        }
        return list;
    }

    public Employee updateEmployeeById(Integer id,Employee NewEmp){
        logger.info("Updating the employee with Id : {}",id);
        Employee emp=employeeRepository.findById(id).orElse(null);
        if(emp!=null){
            if(NewEmp.getEmployeeName()!=null) emp.setEmployeeName(NewEmp.getEmployeeName());
            if(NewEmp.getDept()!=null) emp.setDept(NewEmp.getDept());
            logger.info("Employee updated whose Id is {}",id);
            return employeeRepository.save(emp);
        }else{
            logger.warn("Employee not found with the Id {}",id);
            return null;
        }
    }

    public void deleteEmployeeById(Integer id){
        logger.warn("Deleting the Employee whose ID is {}",id);
        logger.warn("Employee deleted with ID {}",id);
        employeeRepository.deleteById(id);
    }

    public void deleteAllEmployee(){
        logger.warn("Deleting all the employees");
        logger.warn("All the employees were deleted");
        employeeRepository.deleteAll();
    }

    public List<Employee> getAllEmployeesByDepartmentName(String dept){
        logger.info("Retriving the employees with the department code {}",dept);
        List<Employee> list=employeeRepository.getAllEmployeesbyDepartment(dept);
        if(list.size()==0){
            logger.warn("There is no employees in the database");
        }else{
            logger.info("There are {} employees in the db whose department is {}",list.size(),dept);
        }
        return list;
    }
}
