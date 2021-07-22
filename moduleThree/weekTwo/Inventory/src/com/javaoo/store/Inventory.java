package com.javaoo.store;


public class Inventory {
    public static void produceReport(Item[] items) {
        System.out.println("--- BEGIN REPORT ---");
        int count = 0;
        double total = 0.0;
        for(Item item : items) {
            if(item == null) {
                break;
            }
            System.out.format("%-22s\t%-22.2f\t%-22d%n", item.getTitle(), item.getPrice(), item.getQuantity());
            count += item.getQuantity();
            total += item.getPrice();
        }
        System.out.format("%-22s%-22.2f\t%-22d%n","*", total, count);
        System.out.println("--- END REPORT ---");
    }
}
