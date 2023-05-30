package com.persone.information;

public class Man extends Person {


    public Man(String firstName, String lastName, int age, String partner, boolean isDivorced) {
        super(firstName, lastName, age, partner, isDivorced);
    }

    @Override
    public boolean isRetired() {
        if (getAge() >= 65) {
            System.out.println("Already retired");
            return true ;
        }
        return false;
    }


    public void registerPartnership() {
        if (getPartner() == null) {
            System.out.println("Not married");
            return;
        }
        setLastName(getPartner());
        System.out.println("This man is married to " + getPartner());
    }

    public void deregisterPartnership() {
        if (getPartner() == null) {
        } else if (isDivorced()) {
            System.out.println("Has divorced with " + getPartner());
        } else {
            System.out.println("Has a happy marriage");
        }
    }
}



