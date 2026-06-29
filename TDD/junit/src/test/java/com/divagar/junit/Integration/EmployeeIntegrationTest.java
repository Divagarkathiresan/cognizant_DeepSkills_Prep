package com.divagar.junit.Integration;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.hasItems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.divagar.junit.Repositories.EmployeeRepository;
import com.divagar.junit.Models.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
public class EmployeeIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setDataBaseEmpty(){
        employeeRepository.deleteAll();
    }

    //testing post and get
    @Test
    public void shouldSaveAndRetrieveAnEmployee() throws Exception{
        Employee employee=employeeRepository.save(new Employee(null,"Alex","IT"));
        mockMvc.perform(post("/employees/post")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(employee)))
                .andExpect(status().isCreated());
        mockMvc.perform(get("/employees/getAll"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].employeeName").value("Alex"));
    }

    //testing deleting
    @Test
    public void shouldDeleteAnEmployeeById() throws Exception{
        Employee employee=employeeRepository.save(new Employee(null,"Alex","IT"));
        mockMvc.perform(delete("/employees/delete/"+employee.getEmployeeId()))
                .andExpect(status().isOk());

        assertFalse(employeeRepository.findById(employee.getEmployeeId()).isPresent());
    }

    //testing for updating
    @Test
    public void shouldUpdateAnEmployeeById() throws Exception{
        Employee oldEmployee=employeeRepository.save(new Employee(null,"Alex","IT"));
        Employee newEmployee=new Employee(null,"Diva","CSE");
        
        mockMvc.perform(patch("/employees/update/"+oldEmployee.getEmployeeId())
        .contentType(MediaType.APPLICATION_JSON)
        .content(objectMapper.writeValueAsString(newEmployee)))
        .andExpect(status().isOk());
        mockMvc.perform(get("/employees/get/"+oldEmployee.getEmployeeId()))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.employeeName").value("Diva"));
    }
    
    //Testing the list of employees based on department
    @Test
    public void shouldRetrieveListOfEmployeesByDepartment() throws Exception{
        Employee oldEmployee1=employeeRepository.save(new Employee(null,"Alex","IT"));
        Employee oldEmployee2=employeeRepository.save(new Employee(null,"Arjun","CSE"));
        Employee oldEmployee3=employeeRepository.save(new Employee(null,"Diva","IT"));

        mockMvc.perform(get("/employees/getbyDept/IT"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(2))
                .andExpect(jsonPath("$[*].employeeName").value(hasItems("Alex","Diva")));
    }

}
