package com.engeto.example;

public class HotelRoom {
    //když chci vytvořit nový pokoj, co o něm chci vědět
    //public...modifikátor přístupu = tuto třídu můžu v kódu používat kdekoli

    int hotelRoomId;
    String type;
    boolean hasBalcony;
    boolean hasView;
    int pricePerNight;
//už Java ví, jaké informace má ukládat o každém pokoji


    //konstruktor:
    public HotelRoom (int hotelRoomId, String type, boolean hasBalcony, boolean hasView, int pricePerNight)   {
    //když chci vytvořit pokoj, musím zadat <-)
    this.hotelRoomId = hotelRoomId;
    this.type = type;
    this.hasBalcony = hasBalcony;
    this.hasView = hasView;
    this.pricePerNight = pricePerNight;
}

        //vysvětlím, co se s tím pokojem dá dělat - nový řádek - generate - getter and setter

            public int getHotelRoomId() {//getHotelRoomID = návratový typ = jaký je výsledek volání metody (když v main.java zavolám getHotelRoomID - dostanu číslo)
                return hotelRoomId; }

            public void setHotelRoomId(int hotelRoomId) {			//set - nastaví hodnotu, ale vracet nic nebude, proto void
                this.hotelRoomId = hotelRoomId; }

            public String getType() {
                return type; }

            public void setType(String type) {
                this.type = type; }

            public boolean isHasBalcony() {
                return hasBalcony; }

            public void setHasBalcony (boolean hasBalcony) {
                this.hasBalcony = hasBalcony; }

            public boolean isHasView() {
                return hasView; }

            public void setHasView(boolean hasView) {
                this.hasView = hasView; }

            public String getDescription() {
                return "Hotellroom "+hotelRoomId+": "+type+" "+pricePerNight+" CZK/night";
        }

}
