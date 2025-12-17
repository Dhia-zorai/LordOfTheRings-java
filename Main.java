public class Main {
    public static void main(String[] args) {

        Human boromir=new Human("Boromir",300,50);
        Elf elrond = new Elf("Elrond",250,100);
        Dwarf gimli=new Dwarf("Gimli",50,150);
        WarriorThiefDwarf durin=new WarriorThiefDwarf("Durin",50,150,30,20);
        Hobbit frodo =new Hobbit("Frodo",200,100);
        frodo.createSauronsRing();

        System.out.println("----------Character sound----------");
        System.out.println("Boromir a human: "+boromir.speaks());
        System.out.println("Elrond a elf: "+elrond.speaks());
        System.out.println("gimli a dwarf: "+gimli.speaks());
        System.out.println("frodo a hobbit: "+frodo.speaks());

        System.out.println("----------Character Stats----------");
        System.out.println("Boromir HP: " + boromir.getHealth() + ", Coins: " + boromir.getCoins());
        System.out.println("Elrond HP: " + elrond.getHealth() + ", Coins: " + elrond.getCoins());
        System.out.println("Gimli HP: " + gimli.getHealth() + ", Coins: " + gimli.getCoins());
        System.out.println("Frodo HP: " + frodo.getHealth() + ", Coins: " + frodo.getCoins());

        System.out.println("----------Durin steals and attacks from boromir----------");

        durin.steals(boromir);
        durin.attacks(boromir);

        System.out.println("----------Final Stats----------");
        System.out.println("Boromir HP: " + boromir.getHealth()+", Coins: " + boromir.getCoins());














    }
}
