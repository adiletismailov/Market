package com.company.company.interfaces.serviceImpl;

import com.company.company.classes.BankCard;
import com.company.company.classes.Client;
import com.company.company.enums.Market;
import com.company.company.enums.Products;
import com.company.company.interfaces.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ServiceImpl implements Service {
    List<BankCard> bankCardsList = new ArrayList<>();
    List<Client> clientList = new ArrayList<>();
    Products[] products;
    Market markets;

    @Override
    public String creatClient() {
        boolean a = false;
        try {
            System.out.print("Write id: ");
            int setId = new Scanner(System.in).nextInt();
            System.out.print("Write first name: ");
            String setFirstName = new Scanner(System.in).nextLine();
            System.out.print("Write age: ");
            int setAge = new Scanner(System.in).nextInt();
            System.out.print("Write money: ");
            int setMoney = new Scanner(System.in).nextInt();
            Client client = new Client(setId, setFirstName, setAge, new BigDecimal(setMoney));
            a = clientList.add(client);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a ? "Client created successfully:\n" : "Error: \n";
    }


//    @Override
//    public String creatBankCard() {
//        boolean a = false;
//        try {
//            System.out.print("Id: ");
//            int setId = new Scanner(System.in).nextInt();
//            System.out.println("Banks: " + Arrays.toString(Bank.values()));
//            System.out.print("From which bank: (index) : ");
//            int setBankIndex = new Scanner(System.in).nextInt();
//            System.out.println("Cards: " + Arrays.toString(Card.values()));
//            System.out.print("Enter your option (index) : ");
//            int setCardIndex = new Scanner(System.in).nextInt();
//            System.out.print("Card password: ");
//            String setPassword = new Scanner(System.in).nextLine().toLowerCase();
//
//            BankCard bankCard = new BankCard(setId, Bank.values()[setBankIndex], Card.values()[setCardIndex], setPassword, new BigDecimal(new Scanner(System.in).nextLong()));
//            for (BankCard b : bankCardsList) {
//                if (b.getId() < 0) throw new Exception("Error: ");
//            }
//            a = bankCardsList.add(bankCard);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return a ? "Card created successfully.\n" : "Error: ! \n";
//    }

    @Override
    public List<BankCard> getAllBankCard() {
        return bankCardsList;
    }

    @Override
    public List<Client> getAllClient() {
        return clientList;
    }

    @Override
    public List<Products[]> getMarkets() {
        int summa = 0;
        System.out.print("Market: ");
        System.out.println(Arrays.toString(Market.values()));
        for (Products p : Products.values()) {
            System.out.println(p.getName() + "" + p.getPrice());
        }
        return null;
    }

    @Override
    public long goToTheMarket() {
        List<Long> longList = new ArrayList<>();
        for (Products p1 : Products.values()) {
            System.out.println(p1.getName() + " " + p1.getPrice());
        }
        while (true) {
            long summa = 0;
            System.out.print("Purchase: ");
            String name = new Scanner(System.in).nextLine();
            System.out.println("Yes/no");
            String a = new Scanner(System.in).nextLine();
            if (a.equalsIgnoreCase("Yes")) {
                for (Products p : Products.values()) {
                    if (p.getName().equals(name)) {
                        summa += p.getPrice();
                        System.out.println(summa);
                    }
                }
            } else {
                break;
            }
        }return 0;
    }
}