package com.xworkz.employeeapp.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class EmployeeDto {
    private int employeeId;
    private String firstName;
    private String lastName;
    private String yearOfJoining;
    private double salary;
    private String department;
    private int age;
    private String gender;
    private String address;
}
