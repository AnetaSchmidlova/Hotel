package com.engeto.example;

import java.time.LocalDate;

    /**
     * U každého zákazníka budeme v rámci našeho programu chtít evidovat několik základních údajů:
     * jméno, příjmení, datum narození
     */
    public class Guest { //když chci vytvořit nového hosta, co o něm chci vědět // třída - má název a atributy (ty vlastnosti)

        //Atributy:
        String name;
        String surname;
        LocalDate birthday;
//už Java ví, jaké informace má ukládat o každém hostu

        //konstruktor: generate - Constructor
        // v té chvíli, ale už main.java nemůžeme říct, vytvoř nějakého hosta, už musím zadat ty hodnoty
        public Guest (String name, String surname, LocalDate birthday) { //když chci vytvořit hosta, musím zadat jméno, příjmení, datum)
            this.name = name;		//this.name = atribut
            this.surname = surname;
            this.birthday = birthday;
        }

        //přístupové metody
        //zápis metody: Modifikátor_přístupu Návratový_typ Název_metody(musí být vždy kulatá, může nebo nemusí obsahovat paramatr) {
        //		co se má stát, když metodu zavolám
        // }


        public String getName() {
            return name;
        }

        public void setName(String name) {		//= public void setName(String newName) { //name - označuje parametr, this.name - označuje atribut(fialová)!
            this.name = name; 			//	brand = newBrand;
        }
        //this = odkazuje na tento objekt = tento atribut! - třída Customer, myslí se v podstatě ten guest1

        public String getSurname() {			//má to vracet textový řetězec
            return surname;				//vrať a hodnotu
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public LocalDate getBirthday() {
            return birthday;
        }

        public void setBirthday (LocalDate birthday) {
            this.birthday = birthday;
        }

        public String getDescription() {
            return "Host: " + name + " " + surname + " (" + birthday.toString() + ")";
        }

        public String getFullName() {
            return getName()+" "+getSurname();
        }
    }

