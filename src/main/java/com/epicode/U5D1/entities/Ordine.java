package com.epicode.U5D1.entities;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
@Getter
@Setter
public class Ordine {
    private int orderNumber;
    private String status;
    private int numberOfCovers;
    private LocalDateTime acquisitionTime;
    private double totalAmount;
    private List<Item> items;
    private Tavolo table;

    public Ordine(int orderNumber, int numberOfCovers, List<? extends Item> items, Tavolo table) {
        this.orderNumber = orderNumber;
        this.status = "in corso";
        this.numberOfCovers = numberOfCovers;
        this.acquisitionTime = LocalDateTime.now();
        this.items = (List<Item>) items;
        this.table = table;
        this.totalAmount = calculateTotal((List<Item>) items, numberOfCovers);
    }



    private double calculateTotal(List<Item> items, int numberOfCovers) {
        double total = 0.0;
        for (Item item : items) {
            total += item.getPrice();
        }
        total += numberOfCovers;
        return total;
    }

    @Override
    public String toString() {
        return "Ordine{" +
                "numero ordine=" + orderNumber +
                ", stato='" + status + '\'' +
                ", numero di coperti=" + numberOfCovers +
                ", ora dell'ordine=" + acquisitionTime +
                ", totale=" + totalAmount +
                ", prodotti=" + items +
                ", tavolo=" + table +
                '}';
    }
}
