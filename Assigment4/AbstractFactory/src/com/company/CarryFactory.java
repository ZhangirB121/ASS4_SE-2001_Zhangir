package com.company;

public class CarryFactory implements SmiteFactory{
    @Override
    public JapanesePantheon addJapaneseGods(JapanesePantheon.JapaneseGods japaneseGods) {
        return new Danzaburou(japaneseGods);
    }

    @Override
    public NorsePantheon addNorseGods(NorsePantheon.NorseGods norseGods) {
        return new Skadi(norseGods);
    }
}
