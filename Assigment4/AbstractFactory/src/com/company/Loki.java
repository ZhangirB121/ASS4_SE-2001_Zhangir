package com.company;

public class Loki implements NorsePantheon {
    public Loki(NorsePantheon.NorseGods norseGods){
        System.out.println("LOKI\n"+"With sinister precision, take to the shadows and strike when backs are turned.\n");
    }


    @Override
    public void Mythology() {
        System.out.println("Mythology:\n"+"Loki is the son of jotun Farbauti and Lauveya, also mentioned as the god of cunning and deception (according to some versions also of fire), etc");
    }

    @Override
    public void Abilities() {
        System.out.println("Abilities:\n"
                +"Passive - Behind You!\n"
        +"1st Ability - Vanish\n"
        +"2nd Ability - Agonizing Visions\n"
        +"3rd Ability - Flurry Strike\n"
        +"Ultimate - Assassinate\n");
    }
}
