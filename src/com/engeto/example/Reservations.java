package com.engeto.example;

import java.util.ArrayList;
import java.util.List;

public class Reservations {

    List<Reservation> reservations = new ArrayList<Reservation>();

    public void addReservation(Reservation newReservation) {
        reservations.add(newReservation);
    }

    public void printReservations() {
        for (Reservation reservation : reservations) {
            System.out.println(reservation.getDescription());
        }
    }
}
