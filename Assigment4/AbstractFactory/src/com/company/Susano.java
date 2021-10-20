package com.company;

public class Susano implements JapanesePantheon{

    public Susano(JapanesePantheon.JapaneseGods japaneseGods){
        System.out.println("SUSANO\n"+"With sword in hand, you are the storm. Pull foes into the eye of the hurricane.\n");
    }


    @Override
    public void Mythology() {
        System.out.println("Mythology:\n"+"Susanoo or Takehaya Susanoo no Mikoto is the god of wind, in Japanese mythology the last of the deities who appeared from drops of water, with which the first male god Izanagi washed his nose after he returned from yomi no kuni (the land of the dead)\n");
    }

    @Override
    public void Abilities() {
        System.out.println("Abilities:\n"
        +"Passive - Gathering Storm\n"
        +"1st Ability - Storm Kata\n"
        +"2nd Ability - Wind Siphon\n"
        +"3rd Ability - Jet Stream\n"
        +"Ultimate - Typhoon\n");
    }
}
