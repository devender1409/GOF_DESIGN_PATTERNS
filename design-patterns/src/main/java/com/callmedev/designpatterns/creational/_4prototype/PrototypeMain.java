package com.callmedev.designpatterns.creational._4prototype;

import java.math.BigDecimal;

public class PrototypeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Devender","IT", BigDecimal.valueOf(100000));

        System.out.println(employee);

        Employee copied = employee.clone();

        System.out.println(copied);
    }
}
