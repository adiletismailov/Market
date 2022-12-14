package com.company.company.interfaces;

import com.company.company.classes.BankCard;
import com.company.company.classes.Client;
import com.company.company.enums.Products;

import java.util.List;

public interface Service {
    String creatClient();
//    String creatBankCard();
    List<BankCard> getAllBankCard();
    List<Client> getAllClient();
    List<Products[]> getMarkets();
    long goToTheMarket();

}
