package com.xworkz.employeeapp;

import com.xworkz.employeeapp.dto.EmployeeDto;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeRunner {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        List<EmployeeDto> employeeDtoList = new ArrayList<>();

        employeeDtoList.add(new EmployeeDto(11, "Jagadeesh", "Kumar", "2018", 60000.00, "HR", 30, "Male", "Jayanagar, Bengaluru"));
        employeeDtoList.add(new EmployeeDto(20, "Sneha", "Patil", "2019", 48000.00, "HR", 27, "Female", "BTM Layout, Bengaluru"));
        employeeDtoList.add(new EmployeeDto(3, "Arjun", "Reddy", "2020", 52000.00, "Development", 28, "Male", "Rajajinagar, Bengaluru"));
        employeeDtoList.add(new EmployeeDto(14, "Priya", "Shetty", "2017", 75000.00, "Management", 32, "Female", "Koramangala, Bengaluru"));
        employeeDtoList.add(new EmployeeDto(16, "Rashmi", "Mathad", "2021", 50000.00, "IT", 26, "Female", "Rajajinagar, Bengaluru"));
        employeeDtoList.add(new EmployeeDto(6, "Manoj", "Naik", "2015", 85000.00, "IT", 35, "Male", "Basavanagudi, Bengaluru"));
        employeeDtoList.add(new EmployeeDto(17, "Divya", "Sharma", "2020", 55000.00, "IT", 25, "Female", "Indiranagar, Bengaluru"));
        employeeDtoList.add(new EmployeeDto(8, "Kiran", "Patel", "2016", 92000.00, "Sales", 36, "Male", "Whitefield, Bengaluru"));
        employeeDtoList.add(new EmployeeDto(19, "Asha", "Menon", "2022", 48000.00, "Testing", 24, "Female", "Hebbal, Bengaluru"));
        employeeDtoList.add(new EmployeeDto(10, "Vivek", "Rao", "2019", 62000.00, "IT", 29, "Male", "Banashankari, Bengaluru"));
        employeeDtoList.add(new EmployeeDto(1, "Deepa", "Kulkarni", "2021", 53000.00, "Design", 26, "Female", "RT Nagar, Bengaluru"));
        employeeDtoList.add(new EmployeeDto(12, "Suresh", "Gowda", "2018", 70000.00, "IT", 31, "Male", "JP Nagar, Bengaluru"));
        employeeDtoList.add(new EmployeeDto(13, "Neha", "Joshi", "2023", 46000.00, "HR", 23, "Female", "Electronic City, Bengaluru"));
        employeeDtoList.add(new EmployeeDto(4, "Rohan", "Desai", "2017", 82000.00, "HR", 33, "Male", "Ulsoor, Bengaluru"));
        employeeDtoList.add(new EmployeeDto(15, "Pooja", "Iyer", "2022", 51000.00, "Testing", 25, "Female", "Yelahanka, Bengaluru"));
        employeeDtoList.add(new EmployeeDto(5, "Nikhil", "Jain", "2019", 64000.00, "Sales", 28, "Male", "Vijayanagar, Bengaluru"));
        employeeDtoList.add(new EmployeeDto(7, "Anita", "Rao", "2020", 59000.00, "Support", 27, "Female", "Banashankari, Bengaluru"));
        employeeDtoList.add(new EmployeeDto(18, "Karthik", "Bhat", "2016", 95000.00, "Management", 38, "Male", "HSR Layout, Bengaluru"));
        employeeDtoList.add(new EmployeeDto(9, "Meena", "Hegde", "2023", 47000.00, "Design", 24, "Female", "Domlur, Bengaluru"));
        employeeDtoList.add(new EmployeeDto(2, "Ajay", "Verma", "2015", 88000.00, "HR", 37, "Male", "Marathahalli, Bengaluru"));


        System.out.println("Employees Details : ");
        employeeDtoList.forEach(System.out::println);

        System.out.println();
        System.out.println("Employee Details sorted by employeeId : ");
        employeeDtoList.stream().sorted(Comparator.comparing(EmployeeDto::getEmployeeId)).forEach(System.out::println);

        System.out.println();
        System.out.println("Employee Details sorted by firstName : ");
        employeeDtoList.stream().sorted(Comparator.comparing(EmployeeDto::getFirstName)).forEach(System.out::println);

        System.out.println();
        System.out.println("Employee Details sorted by lastName : ");
        employeeDtoList.stream().sorted(Comparator.comparing(EmployeeDto::getLastName)).forEach(System.out::println);

        System.out.println();
        System.out.println("Employee Details sorted by yearOfJoining : ");
        employeeDtoList.stream().sorted(Comparator.comparing(EmployeeDto::getYearOfJoining)).forEach(System.out::println);

        System.out.println();
        System.out.println("Employee Details sorted by salary : ");
        employeeDtoList.stream().sorted(Comparator.comparing(EmployeeDto::getSalary)).forEach(System.out::println);

        System.out.println();
        System.out.println("Employee Details sorted by department : ");
        employeeDtoList.stream().sorted(Comparator.comparing(EmployeeDto::getDepartment)).forEach(System.out::println);

        System.out.println();
        System.out.println("Employee Details sorted by age : ");
        employeeDtoList.stream().sorted(Comparator.comparing(EmployeeDto::getAge)).forEach(System.out::println);

        System.out.println();
        System.out.println("Employee Details sorted by gender : ");
        employeeDtoList.stream().sorted(Comparator.comparing(EmployeeDto::getGender)).forEach(System.out::println);

        System.out.println();
        System.out.println("Employee Details sorted by address : ");
        employeeDtoList.stream().sorted(Comparator.comparing(EmployeeDto::getAddress)).forEach(System.out::println);


        System.out.println();
        System.out.println("Distinct department from the list of employees : ");
        System.out.println(employeeDtoList.stream().map(EmployeeDto::getDepartment).distinct().collect(Collectors.toList()));

        System.out.println();
        System.out.println("Employee with 2nd highest salary : ");
        System.out.println(employeeDtoList.stream().sorted(Comparator.comparing(EmployeeDto::getSalary).reversed()).skip(1).findFirst().get());

        System.out.println();
        System.out.println("Employee with 3rd highest salary  : ");
        System.out.println(employeeDtoList.stream().sorted(Comparator.comparing(EmployeeDto::getSalary).reversed()).skip(2).findFirst().get());

        System.out.println();
        System.out.println("Number of male and female employees from list of Employees: ");
        System.out.println(employeeDtoList.stream().collect(Collectors.groupingBy(EmployeeDto::getGender, Collectors.counting())));

        System.out.println();
        System.out.println("Employee Details sorted by salary and YearOfJoining: ");
        employeeDtoList.stream().sorted(Comparator.comparing(EmployeeDto::getSalary)).sorted(Comparator.comparing(EmployeeDto::getYearOfJoining)).forEach(System.out::println);

        System.out.println();
        System.out.println("Max age of Employee : ");
        System.out.println(employeeDtoList.stream().sorted(Comparator.comparing(EmployeeDto::getAge).reversed()).findFirst().get().getAge());

        System.out.println();
        System.out.println("Min age of Employee : ");
        System.out.println(employeeDtoList.stream().sorted(Comparator.comparing(EmployeeDto::getAge)).findFirst().get());

        System.out.println();
        System.out.println("Employee details sorted by firstName and lastName : ");
        employeeDtoList.stream().sorted(Comparator.comparing(EmployeeDto::getFirstName).thenComparing(EmployeeDto::getLastName)).forEach(System.out::println);

        System.out.println();
        System.out.println("Count of firstName of employees : ");
        System.out.println(employeeDtoList.stream().collect(Collectors.groupingBy(EmployeeDto::getFirstName, Collectors.counting())));


        System.out.println();
        System.out.println("Count of lastName of employees : ");
        System.out.println(employeeDtoList.stream().collect(Collectors.groupingBy(EmployeeDto::getLastName, Collectors.counting())));


        System.out.println();
        System.out.println("Count of yearOfJoining of employees : ");
        System.out.println(employeeDtoList.stream().collect(Collectors.groupingBy(EmployeeDto::getYearOfJoining, Collectors.counting())));


        System.out.println();
        System.out.println("Count of age of employees : ");
        System.out.println(employeeDtoList.stream().collect(Collectors.groupingBy(EmployeeDto::getAge, Collectors.counting())));


        System.out.println();
        System.out.println("Count of address of employees : ");
        System.out.println(employeeDtoList.stream().collect(Collectors.groupingBy(EmployeeDto::getAddress, Collectors.counting())));


        System.out.println();
        System.out.println("Count of salary of employees : ");
        System.out.println(employeeDtoList.stream().collect(Collectors.groupingBy(EmployeeDto::getSalary, Collectors.counting())));


        System.out.println();
        System.out.println("Count of employees in each department : ");
        System.out.println(employeeDtoList.stream().collect(Collectors.groupingBy(EmployeeDto::getDepartment, Collectors.counting())));

        System.out.println();
        System.out.println("Count of Male and female employee of HR department : ");
        System.out.println(employeeDtoList.stream().filter(employeeDto -> employeeDto.getDepartment().equalsIgnoreCase("HR")).collect(Collectors.groupingBy(EmployeeDto::getGender, Collectors.counting())));

        System.out.println();
        System.out.println("Count of Male and female employee of IT department : ");
        System.out.println(employeeDtoList.stream()
                .filter(employeeDto -> employeeDto.getDepartment().equalsIgnoreCase("IT"))
                .collect(Collectors.groupingBy(EmployeeDto::getGender, Collectors.counting())));

        System.out.println();
        System.out.println("Count of Male and female employee of Sales & Marketing department : ");
        System.out.println(employeeDtoList.stream().filter(employeeDto -> employeeDto.getDepartment().equalsIgnoreCase("Sales & Marketing")).collect(Collectors.groupingBy(EmployeeDto::getGender, Collectors.counting())));

        System.out.println();
        System.out.println("Count of Male and Female employees of each department : ");
        System.out.println(employeeDtoList.stream().collect(Collectors.groupingBy(EmployeeDto::getDepartment, Collectors.groupingBy(EmployeeDto::getGender, Collectors.counting()))));


        System.out.println();
        System.out.println("Highest Salary based of department : ");
        System.out.println(employeeDtoList.stream().collect(Collectors.groupingBy(EmployeeDto::getDepartment, Collectors.maxBy(Comparator.comparing(EmployeeDto::getSalary)))));

        System.out.println();
        System.out.println("Find lowest paid salary in each departemnt based on gender : ");
        System.out.println(employeeDtoList.stream().collect(Collectors.groupingBy(EmployeeDto::getDepartment, Collectors.groupingBy(EmployeeDto::getGender, Collectors.minBy(Comparator.comparing(EmployeeDto::getSalary))))));
//                highest paid salary in the arganization based on gender
//                print the top 2 highest salary earned employees in each department

        System.out.println();
        System.out.println(" Highest paid salary in the Organization based on gender :");
        System.out.println(employeeDtoList.stream().collect(Collectors.groupingBy(EmployeeDto::getGender, Collectors.maxBy(Comparator.comparing(EmployeeDto::getSalary)))));


        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("Top 2 highest salary earned employees in each department : ");
        employeeDtoList.stream()
                .collect(Collectors.groupingBy(EmployeeDto::getDepartment,
                        Collectors.collectingAndThen(Collectors.toList(),
                                list -> list.stream()
                                        .sorted(Comparator.comparing(EmployeeDto::getSalary).reversed())
                                        .limit(2)
                                        .collect(Collectors.toList())))).forEach((dep, empl) -> {
                    System.out.println("Department : " + dep);
                    empl.forEach(System.out::println);
                    System.out.println();
                });
        System.out.println("----------------------------------------------------------------------------------------------------------");
        // System.out.println(employeeDtoList.stream().sorted(Comparator.comparing(EmployeeDto::getSalary).reversed()).limit(2).collect(Collectors.groupingBy(EmployeeDto::getDepartment)));
        // employeeDtoList.stream().collect(Collectors.groupingBy(EmployeeDto::getDepartment)).forEach((departmentName,emloyees)->emloyees.stream().sorted(Comparator.comparing(EmployeeDto::getSalary).reversed()).limit(2).forEach(System.out::println));


        System.out.println();
        System.out.println("Group the Employees by city :");
        System.out.println(employeeDtoList.stream().collect(Collectors.groupingBy(EmployeeDto::getAddress)));

        System.out.println();
        System.out.println("Group the Employees by age :");
        System.out.println(employeeDtoList.stream().collect(Collectors.groupingBy(EmployeeDto::getAge)));

        System.out.println();
        System.out.println("Employee details whose age is greater than 28 in the organisation : ");
        employeeDtoList.stream().filter(c -> c.getAge() > 28).forEach(System.out::println);

        System.out.println();
        System.out.println("Maximum age/oldest of employee in the organisation : ");
        System.out.println(employeeDtoList.stream().sorted(Comparator.comparing(EmployeeDto::getAge).reversed()).collect(Collectors.toList()));

        System.out.println();
        System.out.println("Average age of Male and Female Employees in the organisation :");
        System.out.println(employeeDtoList.stream().collect(Collectors.groupingBy(EmployeeDto::getGender, Collectors.averagingInt(EmployeeDto::getAge))));

        System.out.println();
        System.out.println("Average age of Male and Female Employees in each department :");
        System.out.println(employeeDtoList.stream().collect(Collectors.groupingBy(EmployeeDto::getDepartment, Collectors.groupingBy(EmployeeDto::getGender, Collectors.averagingInt(EmployeeDto::getAge)))));

        System.out.println();
        System.out.println("Number of employees in each department : ");
        System.out.println(employeeDtoList.stream().collect(Collectors.groupingBy(EmployeeDto::getDepartment, Collectors.counting())));

        System.out.println();
        System.out.println("Longest serving employees in the organization : ");
        System.out.println(employeeDtoList.stream().max(Comparator.comparing(EmployeeDto::getYearOfJoining)).get());

        System.out.println();
        System.out.println("Longest serving employee in each department :");
        System.out.println(employeeDtoList.stream().collect(Collectors.groupingBy(EmployeeDto::getDepartment, Collectors.collectingAndThen(Collectors.toList(), list -> list.stream().sorted(Comparator.comparing(EmployeeDto::getYearOfJoining)).findFirst()))));

        System.out.println();
        System.out.println("Average age of gender in each department : ");
        System.out.println(employeeDtoList.stream().collect(Collectors.groupingBy(EmployeeDto::getDepartment, Collectors.groupingBy(EmployeeDto::getGender, Collectors.averagingInt(EmployeeDto::getAge)))));

        System.out.println();
        System.out.println("Youngest female employee in the organisation :");
        System.out.println(employeeDtoList.stream().filter(c -> c.getGender().equalsIgnoreCase("female")).min(Comparator.comparing(EmployeeDto::getAge)).get());

        System.out.println();
        System.out.println("youngest employee in each department : ");
        System.out.println(employeeDtoList.stream().collect(Collectors.groupingBy(EmployeeDto::getDepartment, Collectors.collectingAndThen(Collectors.toList(), list -> list.stream().min(Comparator.comparing(EmployeeDto::getAge))))));

        System.out.println();
        System.out.println("Employees whose age is greater than 30 and leass than 30:");
        System.out.println(employeeDtoList.stream().collect(Collectors.partitioningBy(c -> c.getAge() > 30, Collectors.partitioningBy(c -> c.getAge() < 30))));

//        System.out.println();
//        System.out.println("Employees whose age is less than 30 :");
//        employeeDtoList.stream().filter(c->c.getAge()<30).forEach(System.out::println);

        System.out.println();
        System.out.print("Department name which has the highest number of employees : ");
        System.out.println(employeeDtoList.stream()
                .collect(Collectors.groupingBy(EmployeeDto::getDepartment, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get().getKey());

        System.out.println();
        System.out.println("If there any employees from HR Department :");
        System.out.println(employeeDtoList.stream().anyMatch(c -> c.getDepartment().equalsIgnoreCase("hr")));

        System.out.println();
        System.out.print("Name of employees who lives in Bengaluru : ");
        employeeDtoList.stream()
                .filter(c -> c.getAddress().equalsIgnoreCase("Rajajinagar, Bengaluru"))
                .sorted(Comparator.comparing(EmployeeDto::getFirstName)).collect(Collectors.toList())
                .forEach((name) -> System.out.println(name.getFirstName()));

        System.out.println();
        System.out.println("Department name where there are more than 3 employees : ");
        employeeDtoList.stream()
                .collect(Collectors.groupingBy(EmployeeDto::getDepartment, Collectors.counting()))
                .entrySet().stream()
                .filter(c->c.getValue()>3).forEach(n-> System.out.println(n.getKey()));

        System.out.println();
        System.out.print("Number of employees in organization : ");
        System.out.println(employeeDtoList.stream().count());

        System.out.println();
        System.out.println("Employee count in every department : ");
        System.out.println(employeeDtoList.stream().collect(Collectors.groupingBy(EmployeeDto::getDepartment,Collectors.counting())));

        System.out.println();
        System.out.print("Department name which has the highest number of employees : ");
        System.out.println(employeeDtoList.stream()
                .collect(Collectors.groupingBy(EmployeeDto::getDepartment, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get().getKey());

        System.out.println();
        System.out.println("Sorting by age and name fields : ");
        employeeDtoList.stream()
                .sorted(Comparator.comparing(EmployeeDto::getAge)
                        .thenComparing(EmployeeDto::getFirstName))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println();
        System.out.print("Average salary of the organization : ");
        System.out.println(employeeDtoList.stream().collect(Collectors.averagingDouble(EmployeeDto::getSalary)));

        System.out.println();
        System.out.print("Total salary of organization :");
        System.out.println(employeeDtoList.stream().collect(Collectors.summingDouble(EmployeeDto::getSalary)));

        System.out.println();
        System.out.println("Average salary of each department : ");
        System.out.println(employeeDtoList.stream().collect(Collectors.groupingBy(EmployeeDto::getDepartment,Collectors.averagingDouble(EmployeeDto::getSalary))));

        System.out.println();
        System.out.println("Average salary by gender in each department : ");
        employeeDtoList.stream()
                .collect(Collectors.groupingBy(EmployeeDto::getDepartment,Collectors.groupingBy(EmployeeDto::getGender,Collectors.averagingDouble(EmployeeDto::getSalary))))
                .forEach((dep,emp)->{ System.out.println("Department : "+dep);
                    System.out.println(emp);
                    System.out.println();
                });
        System.out.println("-----------------------------------------------------------");

        System.out.println();
        System.out.println("List of employees from each department whose salary is greater than the average salary of their department : ");
        employeeDtoList.stream().collect(Collectors.groupingBy(EmployeeDto::getDepartment,Collectors.averagingDouble(EmployeeDto::getSalary))).forEach((dep,avg)->
        {
            System.out.println("Department: "+dep+" , Average salary of "+dep+" : "+avg);
            employeeDtoList.stream().filter(c->c.getDepartment().equalsIgnoreCase(dep)&& c.getSalary()>avg).forEach(System.out::println);
            System.out.println();
        });

        System.out.println();
        System.out.print("Highest salary in organization : ");
        System.out.println(employeeDtoList.stream().max(Comparator.comparing(EmployeeDto::getSalary)).get().getSalary());


        System.out.print("Second Highest salary in organization : ");
        System.out.println(employeeDtoList.stream().sorted(Comparator.comparing(EmployeeDto::getSalary).reversed()).skip(1).findFirst().get().getSalary());

        System.out.println();
        System.out.print("enter the number : ");
        int n=sc.nextInt();
        System.out.println("The "+n+"th highest salary in Organization : "+employeeDtoList.stream().sorted(Comparator.comparing(EmployeeDto::getSalary).reversed()).skip(n-1).findFirst().get().getSalary());

        System.out.println();
        System.out.println("Top 3 highest salary earned employees in the organisation : ");
        employeeDtoList.stream().sorted(Comparator.comparing(EmployeeDto::getSalary).reversed()).limit(3).forEach(System.out::println);

        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("Top 2 highest salary earned employees in each department : ");
        employeeDtoList.stream()
                .collect(Collectors.groupingBy(EmployeeDto::getDepartment,
                        Collectors.collectingAndThen(Collectors.toList(),
                                list -> list.stream()
                                        .sorted(Comparator.comparing(EmployeeDto::getSalary).reversed())
                                        .limit(2)
                                        .collect(Collectors.toList())))).forEach((dep, empl) -> {
                    System.out.println("Department : " + dep);
                    empl.forEach(System.out::println);
                    System.out.println();
                });
        System.out.println("----------------------------------------------------------------------------------------------------------");

        System.out.println();
        System.out.println("Highest paid salary in the organisation based on gender : ");
        employeeDtoList.stream()
                .collect(Collectors.groupingBy(EmployeeDto::getGender,Collectors.maxBy(Comparator.comparing(EmployeeDto::getSalary))))
                .forEach((gender,sal)->{
                    System.out.println("Gender : "+gender+" , Salary :"+sal.get().getSalary());
                });

        System.out.println();
        System.out.println("Lowest paid salary in the organisation : "+employeeDtoList.stream().min(Comparator.comparing(EmployeeDto::getSalary)).get().getSalary());

        System.out.println();
        System.out.println("Lowest paid salary in each department based on the gender : ");
        System.out.println();
        employeeDtoList.stream()
                .collect(Collectors.groupingBy(EmployeeDto::getDepartment,Collectors.groupingBy(EmployeeDto::getGender,Collectors.minBy(Comparator.comparing(EmployeeDto::getSalary)))))
                .forEach((dep,empl)->{
                    System.out.println("Department : "+dep);
                   empl.forEach((gender,emp)->{
                       System.out.println("Gender : "+gender+", lowest Salary : "+emp.get().getSalary());
                   });
                });

        System.out.println();
        System.out.println("Sorting the employees salary in the organisation in ascending order : ");
        employeeDtoList.stream().sorted(Comparator.comparing(EmployeeDto::getSalary)).collect(Collectors.toList()).forEach((emp)-> System.out.println(emp.getSalary()));

        System.out.println();
        System.out.println("Sorting the employees salary in the organisation in descending order");
        employeeDtoList.stream().sorted(Comparator.comparing(EmployeeDto::getSalary).reversed()).collect(Collectors.toList()).forEach((emp)-> System.out.println(emp.getSalary()));

        System.out.println();
        System.out.println("Highest salary based on department : ");
        employeeDtoList.stream()
                .collect(Collectors.groupingBy(EmployeeDto::getDepartment,Collectors.maxBy(Comparator.comparing(EmployeeDto::getSalary))))
                .forEach((dep,employeeDto)->{
                    System.out.println("Department : "+dep+", highest salary : "+employeeDto.get().getSalary());
                });

        System.out.println();
        System.out.println("Lowest paid based in each department : ");
        employeeDtoList.stream()
                .collect(Collectors.groupingBy(EmployeeDto::getDepartment,Collectors.minBy(Comparator.comparing(EmployeeDto::getSalary))))
                .forEach((dep,employeeDto)->{
                    System.out.println("Department : "+dep+", lowest salary : "+employeeDto.get().getSalary());
                });

        System.out.println();
        System.out.println("Employees with second highest salary  based on department");
        employeeDtoList.stream().collect(Collectors.groupingBy(EmployeeDto::getDepartment,Collectors.collectingAndThen(Collectors.toList(),list->list.stream()
                .sorted(Comparator.comparing(EmployeeDto::getSalary).reversed()).skip(1).findFirst()))).forEach((dep,emp)->{
            System.out.println("Department : "+dep);
            System.out.println(emp);

        });


        System.out.println();
        System.out.println("Sort the employees salary in each department in ascending order :");
        employeeDtoList.stream().sorted(Comparator.comparing(EmployeeDto::getSalary)).collect(Collectors.groupingBy(EmployeeDto::getDepartment)).forEach((dep,empl)->{
            System.out.println("Department : "+dep);
            System.out.println("Salary of employees : ");
            empl.forEach((emp)->{
                System.out.println(emp.getSalary());
            });
            System.out.println();
        });

        System.out.println();
        System.out.println("Sort the employees salary in each department in descending order :");
        employeeDtoList.stream().sorted(Comparator.comparing(EmployeeDto::getSalary).reversed()).collect(Collectors.groupingBy(EmployeeDto::getDepartment)).forEach((dep,empl)->{
            System.out.println("Department : "+dep);
            System.out.println("Salary of employees : ");
            empl.forEach((emp)->{
                System.out.println(emp.getSalary());
            });
            System.out.println();
        });

        System.out.println();
        System.out.println("Employees whose age is less than 30 in HR department : ");
        employeeDtoList.stream().filter(c->c.getDepartment().equalsIgnoreCase("hr")).filter(a->a.getAge()<30).forEach(System.out::println);

        System.out.println();
        System.out.println("Employees whose name start with J : ");
        employeeDtoList.stream().filter(c->c.getFirstName().startsWith("J")).collect(Collectors.toList()).forEach(System.out::println);
    }
}
