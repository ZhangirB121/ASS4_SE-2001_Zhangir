package com.company;

public class Main {

    public static void main(String[] args) {
	    SmiteFactory assassinFactory = new AssassinFactory();
	    SmiteFactory carryFactory = new CarryFactory();

        JapanesePantheon susano = assassinFactory.addJapaneseGods(JapanesePantheon.JapaneseGods.Susano);
        susano.Mythology();
        susano.Abilities();

//        NorsePantheon skadi = carryFactory.addNorseGods(NorsePantheon.NorseGods.Skadi);
//        skadi.Mythology();
//        skadi.Abilities();
    }
}
