package com.persone.information;

public class Woman extends Person {

    private String lastNameOriginal;


    public Woman(String firstName, String lastName, int age, String partner, boolean isDivorced, String lastNameOriginal) {
        super(firstName, lastName, age, partner, isDivorced);
        this.lastNameOriginal = lastNameOriginal;
    }

    @Override
    public boolean isRetired() {
        if (getAge() >= 60) {
            System.out.println("Already retired");
            return true;
        }
        return false;
    }

    public void registerPartnership() {
        if (getPartner() == null) {
            System.out.println("Not married");
        } else {
            setLastName(getPartner());
            System.out.println("This woman has married to " + getPartner());
        }
    }

    public void deregisterPartnership() {
        if (getPartner() == null) {
        } else if (isDivorced()) {
            setLastName(lastNameOriginal);
            System.out.println("Has divorced with " + getPartner());
        } else {
            System.out.println("Has a happy marriage");
        }
    }
    public String getLastNameOriginal() {
        return lastNameOriginal;
    }

    public void setLastNameOriginal(String lastNameOriginal) {
        this.lastNameOriginal = lastNameOriginal;
    }
}
