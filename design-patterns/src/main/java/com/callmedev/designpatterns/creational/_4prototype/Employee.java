package com.callmedev.designpatterns.creational._4prototype;

import java.math.BigDecimal;

public class Employee implements Prototype<Employee>{
    private String name;
    private String department;
    private BigDecimal salary;
    private boolean isCloned;

    public Employee(String name, String department, BigDecimal salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    private Employee(String name, String department, BigDecimal salary, boolean isCloned) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.isCloned = isCloned;
    }

    @Override
    public Employee clone() {
        return new Employee(this.name, this.department, this.salary,true);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", department='").append(department).append('\'');
        sb.append(", salary=").append(salary);
        sb.append(", isCloned=").append(isCloned);
        sb.append('}');
        return sb.toString();
    }
}
