package com.persone.information;

public abstract class Person {


    private String firstName;
    private String lastName;
    private int age;
    private String partner;
    private boolean isDivorced;


    public Person(String firstName, String lastName, int age, String partner, boolean isDivorced) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.partner = partner;
        this.isDivorced = isDivorced;

    }

    public abstract boolean isRetired();

    public abstract void registerPartnership();

    public void deregisterPartnership() {
        if (isDivorced) {
            System.out.println("Has divorced with " + partner);
        }
    }

    public boolean isDivorced() {
        return isDivorced;
    }

    public void setDivorced(boolean divorced) {
        isDivorced = divorced;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}




