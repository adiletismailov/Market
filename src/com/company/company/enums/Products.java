package com.company.company.enums;

public enum Products {
    BANANA("Banana: ",150),
    APPLE("Apple: ",60),
    PINEAPPLE("Pineapple: ",250),
    SNICKERS("Snickers: ",65),
    KINDER("Kinder: ",60),
    KIT_KAT("Kit-Kat: ",50),
    MILKA("Milka: ",40),
    BOUNTY("Bounty: ",45),
    MARS("Mars: ",55),
    TWIX("Twix: ",35),
    COCA_COLA("Coca_Cola: ",85),
    PEPSI("Pepsi: ",80),
    ASU("Asu: ",45),
    LEGEND("Legend: ",35),
    NITRO("Nitro: ",65),
    DRIVE("Drive: ",60),
    FUSE_TEA("Fuse_Tea: ",120),
    JACK_DANIELS("Jack_Daniels: ",2500),
    PROPER_TWELVE("Proper_Twelve: ",3500);

    String name;
    long price;

    Products(String name, long price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}