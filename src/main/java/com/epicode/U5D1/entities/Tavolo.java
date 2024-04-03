package com.epicode.U5D1.entities;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class Tavolo {
    private int number;
    private int maxCovers;
    private String status; // [occupato, libero]

    public Tavolo(int number, int maxCovers) {
        this.number = number;
        this.maxCovers = maxCovers;
        this.status = "libero";
    }

    @Override
    public String toString() {
        return "Tavolo{" +
                "number=" + number +
                ", maxCovers=" + maxCovers +
                ", status='" + status + '\'' +
                '}';
    }
}
