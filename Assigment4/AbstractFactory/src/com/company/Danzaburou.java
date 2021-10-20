package com.company;

public class Danzaburou implements JapanesePantheon{
    public Danzaburou(JapanesePantheon.JapaneseGods japaneseGods){
        System.out.println("DANZABUROU\n"+"Toss out money bags and sake bottles alike into the enemy lines to cause chaos.\n");
    }

    @Override
    public void Mythology() {
        System.out.println("Mythology:\n"+"Danzaburou-danuki  is a bake-danuki passed down in stories on Sado Island, particularly in Aikawa and Niigata.\n");
    }

    @Override
    public void Abilities() {
        System.out.println("Abilities:\n"
                +"Passive - Dubious Savings\n"
        +"1st Ability - Fool’s Gold\n"
        +"2nd Ability - Alluring Spirits\n"
        +"3rd Ability - Tanuki Trickery\n"
        +"Ultimate - Uproarious Rocket\n");
    }
}
