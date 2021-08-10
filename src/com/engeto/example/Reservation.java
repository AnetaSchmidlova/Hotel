package com.engeto.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Reservation {

        Guest mainGuest;
        List<Guest> otherGuests = new ArrayList<>();
        HotelRoom hotelRoom;
        LocalDate begin;
        LocalDate end;
        //boolean isWorking; - logická hodnota na typ pobytu, lze využít při dvou variantách
        TypeOfStay type;            //nový datový typ - druh pobytu

        public Reservation(Guest mainGuest, HotelRoom hotelRoom, LocalDate begin, LocalDate end, TypeOfStay type) {
            this.mainGuest = mainGuest;
            this.hotelRoom = hotelRoom;
            this.begin = begin;
            this.end = end;
            this.type = type;       //nebo lze hodnota zadat přímo sem
        }
        public Reservation(Guest mainGuest, HotelRoom hotelRoom) {
            this(mainGuest, hotelRoom, LocalDate.now(), LocalDate.now().plusDays(7), TypeOfStay.HOLIDAY);
        }

        public Guest getMainGuest() {
            return mainGuest;
        }

        public void setMainGuest(Guest mainGuest) {
            this.mainGuest = mainGuest;
        }

        public TypeOfStay getType() {
            return type;
        }

        public void setType(TypeOfStay type) {
            this.type = type;
        }

        public void addGuest(Guest newGuest) {
            otherGuests.add(newGuest);
        }
        public void removeGuest(Guest guest) {
            otherGuests.remove(guest);
        }
        public void clearOtherGuests() {
            otherGuests.clear();
        }

        public HotelRoom getHotelRoom() {
            return hotelRoom;
        }

        public void setRoom(HotelRoom hotelRoom) {
            this.hotelRoom = hotelRoom;
        }

        public LocalDate getBegin() {
            return begin;
        }

        public void setBegin(LocalDate begin) {
            this.begin = begin;
        }

        public LocalDate getEnd() {
            return end;
        }

        public void setEnd(LocalDate end) {
            this.end = end;
        }

        public String getDescription() {
            StringBuilder result = new StringBuilder("Reservation for "+mainGuest.getFullName()+" ("+type
                    +") from " + begin.toString() + " to " + end.toString() + " other guests: ");
            for (Guest guest : otherGuests) {
                result.append(guest.getFullName()).append(" ");
            }
            return result.toString();
    }
}
