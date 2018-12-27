package com.izdebski.SpringBootHibernateProject.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="employee_table")
public class Employee {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer Id;

    @Column(name="name")
    private String name;

    @Column(name="date_of_joining")
    private Date doj;

    @Column(name="salary")
    private Double salary;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}