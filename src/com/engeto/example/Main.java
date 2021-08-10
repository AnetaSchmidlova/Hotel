package com.engeto.example;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

            //vytvoření proměnné datového typu Guest
        Guest guest1 = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        guest1.getDescription();

//vytvoření objektu třídy Guest, vytvoření toho hosta, new a název třídy
//potřebujeme hostu nastavit vlastnosti  - vytvoříme objektové metody
// atributy mají, ale hodnoty ne = platí dokud byla závorka prázdná
//(jakmile tuto závorku vyplním - udávám hodnoty)

        //System.out.println(guest1.getName()) - tohle ale nechci, vytvořím konstruktor - zavolá se vždy, když voláme operátor new



        Guest guest2 = new Guest("Jan", "Dvořáček", LocalDate.of(1995,5,5));
        guest2.getDescription();

        HotelRoom hotelRoom1 = new HotelRoom (1, "singleRoom", true, true, 1000);   //vytvoř pokoj č.1 se zadanými atributy
        HotelRoom hotelRoom2 = new HotelRoom (1, "singleRoom", true, true, 1000);   //vytvoř pokoj č.2 se zadanými atributy
        HotelRoom hotelRoom3 = new HotelRoom (3, "doubleRoom", false, true, 2400); //vytvoři pokoj č. 3 se zadanými atributy

        System.out.println(hotelRoom1.getDescription());    //vypiš popis pokoje č.1
        System.out.println(hotelRoom2.getDescription());    //vypiš popis pokoje č.2
        System.out.println(hotelRoom3.getDescription());    //vypiš popis pokoje č.3

        Reservations reservations = new Reservations();
        Reservation reservation1 = new Reservation(guest1, hotelRoom1, LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26), TypeOfStay.HOLIDAY);
        reservations.addReservation(reservation1);

        Reservation reservation2 = new Reservation(guest1, hotelRoom3, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), TypeOfStay.WORKING);
        reservation2.addGuest(guest2);
        reservations.addReservation(reservation2);

        //Vypiš seznam všech rezervací
        reservations.printReservations();
    }
}
