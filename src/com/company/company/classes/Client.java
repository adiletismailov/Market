package com.company.company.classes;

import java.math.BigDecimal;

public class Client {
    private long id;
    private String firstName;
    private int age;
    private BigDecimal money;

    public Client() {
    }

    public Client(long id, String firstName, int age, BigDecimal money) {
        this.id = id;
        this.firstName = firstName;
        this.age = age;
        this.money = money;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "\nClient{" +
                "\nid=" + id +
                ",\nfirstName='" + firstName + '\'' +
                ",\nage=" + age +
                ",\nmoney=" + money +
                '}';
    }
}
