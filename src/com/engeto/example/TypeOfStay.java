package com.engeto.example;

    public enum TypeOfStay {
        WORKING ("pracovní"), HOLIDAY ("rekreační");

        //enum - výčtový typ
    //public - enum - název (PascalCase)
    //jak enum VYTVOŘIT!
    //pravé tlačítko na com.engeto. - new - JavaClass (jako třída) - ale vybereme Enum, napíšu název
            // hodnoty, které můžou v těch možnostech být, velká písmena = konstanty

        String description; //každá varianta výčtového typu bude mít u sebe popis

        TypeOfStay(String description) {
            this.description = description;
        }
        //konstruktor, potřebuji nastavit hodnotu těch tříd, když vytvářím objekt té dané třídyp potřebuji nastavit hodnoty
        //u enumu nesmí být konstruktor public
        //v této chvíli k enumu dopíšeme description:

        public String toString() { //bude mít metodu toString, bude potřebovat i konstruktor
        return description;
    }

}
