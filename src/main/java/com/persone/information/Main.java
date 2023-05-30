package com.persone.information;

public class Main {
    public static void main(String[] args) {
        Woman personGalya = new Woman("Galya", "Huk", 61, "Misha Kuk", false, "Huk");
        Woman personLola = new Woman("Lola", "Gukenko", 35, null, true, "Jonika");

        Man personBas = new Man("Bas", "Toretto", 66, "Milla Yovovich", true);
        Man personLiubomir = new Man("Liubomir", "Suduk", 30, "Tania Suduk", false);
        System.out.println("Galya");
        personGalya.isRetired();
        personGalya.registerPartnership();
        personGalya.deregisterPartnership();
        System.out.println();
        System.out.println("Lola");
        personLola.isRetired();
        personLola.registerPartnership();
        personLola.deregisterPartnership();
        System.out.println();
        System.out.println("Bas");
        personBas.isRetired();
        personBas.registerPartnership();
        personBas.deregisterPartnership();
        System.out.println();
        System.out.println("Liubomir");
        personLiubomir.isRetired();
        personLiubomir.registerPartnership();
        personLiubomir.deregisterPartnership();
        System.out.println();


    }

}
