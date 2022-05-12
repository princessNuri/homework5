package com.company;

public class Main {

    public static void main(String[] args) {
        Boss b1= new Boss();
        b1.setHealth(500);
        b1.setDamage(50);
        b1.setTypeOfDefence("Warrior");
        System.out.println("Boss health : "+ b1.getHealth()+"        Boss damage : "+b1.getDamage()+"        Boss type of defence : "+b1.getTypeOfDefence());
        createHeroes();
        for (Hero hero :createHeroes()) {
            System.out.println("health : "+hero.getHealth()+"         damage : "+hero.getDamage()+"         superpower : "+hero.getSuperpower());
        }
    }
    public static Hero[] createHeroes(){
        Hero[] ourHeroes= new Hero[3];
        Hero warrior = new Hero(250,30,"Warrior");
        Hero mag = new Hero(240,25,"Mag");
        Hero kinetic =new Hero(230,20);
        ourHeroes[0]=warrior;
        ourHeroes[1]=mag;
        ourHeroes[2]=kinetic;
        return ourHeroes;
    }
}
