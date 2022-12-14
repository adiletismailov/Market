package com.company.company.classes;

import com.company.company.enums.Bank;

import java.math.BigDecimal;

public class BankCard {
    private int id;
    private Bank banks;
    private String password;
    private BigDecimal money;

    public BankCard (int id, Bank banks, String password, BigDecimal money) {
        this.id = id;
        this.banks = banks;
        this.password = password;
        this.money = money;
    }

    public BankCard() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Bank getBanks() {
        return banks;
    }

    public void setBanks(Bank banks) {
        this.banks = banks;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "\nBankCard{" +
                ",\nid= " + id +
                ",\nbanks= " + banks +
                ",\npassword=' " + password + '\'' +
                ",\nmoney=' " + money+
                '}';
    }
}
