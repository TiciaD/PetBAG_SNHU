package com.Java;

public class Pet<String> {
    // initialize variables for pet type, name, age, number of days staying, amount of dog/cat spaces and amount due
    private String petType;
    private String petName;
    private int petAge;
    private int daysStay;
    private int dogSpaces = 30;
    private int catSpaces = 12;
    private double amountDue;

    // Constructor
    public Pet(String petType, String petName, int petAge, int daysStay, int dogSpaces, int catSpaces, double amountDue) {
        this.petType = petType;
        this.petName = petName;
        this.petAge = petAge;
        this.daysStay = daysStay;
        this.dogSpaces = dogSpaces;
        this.catSpaces = catSpaces;
        this.amountDue = amountDue;
    }


    // Accessor (Getter) and Mutator (Setter) Methods

    // Accessor or Getter method for pet type variable
    public String getPetType() {
        return petType;
    }
    // Mutator or Setter method for pet type variable
    public void setPetType(String petType) {
        this.petType = petType;
    }

    // Accessor or Getter method for pet name variable
    public String getPetName() {
        return petName;
    }
    // Mutator or Setter method for pet name variable
    public void setPetName(String petName) {
        this.petName = petName;
    }

    // Accessor or Getter method for pet age variable
    public int getPetAge() {
        return petAge;
    }
    // Mutator or Setter method for pet age variable
    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    // Accessor or Getter method for days stay variable
    public int getDaysStay() {
        return daysStay;
    }
    // Mutator or Setter method for days stay variable
    public void setDaysStay(int daysStay) {
        this.daysStay = daysStay;
    }

    // Accessor or Getter method for dog spaces variable
    public int getDogSpaces() {
        return dogSpaces;
    }
    // Mutator or Setter method for dog spaces variable
    public void setDogSpaces(int dogSpaces) {
        this.dogSpaces = dogSpaces;
    }

    // Accessor or Getter method for cat spaces variable
    public int getCatSpaces() {
        return catSpaces;
    }
    // Mutator or Setter method for cat spaces variable
    public void setCatSpaces(int catSpaces) {
        this.catSpaces = catSpaces;
    }

    // Accessor or Getter method for amount due variable
    public double getAmountDue() {
        return amountDue;
    }
    // Mutator or Setter method for amount due variable
    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }
}
