package com.alibaba.test;

/**
 * Created by MSI on 2017/4/9.
 */
public class Employee {
    private Integer id;
    private Person person;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Employee(Integer id, Person person) {
        this.id = id;
        this.person = person;
    }
}
