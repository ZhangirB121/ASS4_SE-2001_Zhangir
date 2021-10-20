package com.company;

public class AssassinFactory implements SmiteFactory{


    @Override
    public JapanesePantheon addJapaneseGods(JapanesePantheon.JapaneseGods japaneseGods) {
        return new Susano(japaneseGods);
    }

    @Override
    public NorsePantheon addNorseGods(NorsePantheon.NorseGods norseGods) {
        return new Loki(norseGods);
    }
}
