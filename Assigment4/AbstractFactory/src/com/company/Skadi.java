package com.company;

public class Skadi implements NorsePantheon{
    public Skadi(NorsePantheon.NorseGods norseGods){
        System.out.println("SKADI\n"+"Chase with the Winter Wolf and control the ground that the enemies walk upon.\n");
    }


    @Override
    public void Mythology() {
        System.out.println("Mythology:\n"+"Skadi in Scandinavian mythology is a frost-covered giantess, the patroness of hunting. Her attributes are a bow and skis.\n");
    }

    @Override
    public void Abilities() {
        System.out.println("Abilities:\n"
                +"Passive - Kaldr, The Winter Wolf\n"
        +"1st Ability - Piercing Cold\n"
        +"2nd Ability - Rune of the Hunt\n"
        +"3rd Ability - Permafrost\n"
        +"Ultimate - Winter's Grasp\n");
    }
}
