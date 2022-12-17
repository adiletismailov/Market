package com.company;

import com.company.company.interfaces.Service;
import com.company.company.interfaces.serviceImpl.ServiceImpl;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        ServiceImpl service = new ServiceImpl();
        while (true) {
            System.out.print("""
                    ~ ~ ~ ~ ~ ~ ~COMMANDS~ ~ ~ ~ ~ ~ ~
                    1. Creat a client:
                    2. Get all client:
                    3  Get all product:
                    4. Go to the Market:
                    5. Chek:
                                        
                    Write a command:\020""");
            int number = new Scanner(System.in).nextInt();
            switch (number) {
                case 1 -> System.out.println(service.creatClient());
//                case 2 -> System.out.println(service.creatBankCard());
                case 2 -> System.out.println(service.getAllClient());
//                case 3 -> System.out.println(service.getAllBankCard());
                case 3 -> System.out.println(service.getMarkets());
                case 4 -> System.out.println(service.goToTheMarket());
                case 5 -> System.out.println(service.getAllChek());
            }
        }
    }
}
