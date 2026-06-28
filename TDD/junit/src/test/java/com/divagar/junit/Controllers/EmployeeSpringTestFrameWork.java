package com.divagar.junit.Controllers;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import com.divagar.junit.Models.Employee;
import com.divagar.junit.Services.EmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(EmployeeController.class)
public class EmployeeSpringTestFrameWork{

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EmployeeService employeeService;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    //checked save method
    public void shouldSaveAnEmployee() throws Exception{
        Employee employee=new Employee(1,"diva","IT");
        when(employeeService.saveEmployee(any(Employee.class))).thenReturn(employee);

        mockMvc.perform(post("/employees/post")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(employee)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.employeeId").value(1))
                .andExpect(jsonPath("$.employeeName").value("diva"))
                .andExpect(jsonPath("$.dept").value("IT"));

    }
    @Test
    //checked for get method
    public void shouldReturnEmployeeById() throws Exception {
        //arrange
        Employee employee = new Employee(1, "Alex", "IT");
        when(employeeService.getEmployeeById(1))
                .thenReturn(employee);
        //act & assert
        mockMvc.perform(get("/employees/get/1"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.employeeId").value(1))
            .andExpect(jsonPath("$.employeeName").value("Alex"))
            .andExpect(jsonPath("$.dept").value("IT"));
    }

    @Test
    public void shouldReturnAllEmployees() throws Exception{
        Employee emp1=new Employee(1,"Alex","IT");
        Employee emp2=new Employee(2,"Diva","CSE");
        List<Employee> list=Arrays.asList(emp1,emp2);
        when(employeeService.getAllEmployees()).thenReturn(list);

        mockMvc.perform(get("/employees/getAll"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$[0].employeeName").value("Alex"));
    }

    @Test
    //checked for delete by id
    public void shouldDeleteAnEmployeeById() throws Exception{
        Employee employee=new Employee(1,"Alex","IT");
        when(employeeService.getEmployeeById(1)).thenReturn(employee);
        doNothing().when(employeeService).deleteEmployeeById(1);

        mockMvc.perform(delete("/employees/delete/1"))
                .andExpect(status().isOk());

    }

    @Test
    //checked for update
    public void shouldUpdateAnEmployeeById() throws Exception{
        Employee oldEmployee=new Employee(1,"Alex","IT");
        Employee newEmployee=new Employee(1,"Diva","CSD");
        when(employeeService.getEmployeeById(1)).thenReturn(oldEmployee);
        when(employeeService.updateEmployeeById(anyInt(),any(Employee.class))).thenReturn(newEmployee);

        mockMvc.perform(patch("/employees/update/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(newEmployee)))
                .andExpect(status().isOk());
    }



}