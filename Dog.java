package com.Java;

public class Dog {
	// initialize variables for dog's weight, space number and grooming status
	public double dogSpaceNum;
	public double dogWeight;
	public boolean isGrooming;
	
	
	// Constructor
	public Dog() {
		// set default space number to 0
		dogSpaceNum = 0;
		// set default weight to 1.0
		dogWeight = 1.0;
		// set default grooming status to false
		isGrooming = false;
	}
	
	
	// Accessor or Getter method for dog weight variable
	public double getDogWeight() {
		return dogWeight;
	}
	// Mutator or Setter method for dog weight variable
	public void setDogWeight(double dogWeight) {
		this.dogWeight = dogWeight;
	}
	
	// Accessor or Getter method for grooming status variable
	public boolean getGroomingStatus() {
		return isGrooming;
	}
	// Mutator or Setter method for grooming status variable
	public void setGroomingStatus(boolean grooming) {
		this.isGrooming = grooming;
	}
	
	// Accessor or Getter method for space number variable
	public double getDogSpaceNum() {
		return dogSpaceNum;
	}
	// Mutator or Setter method for space number variable
	public void setDogSpaceNum(int spaceNum) {
		this.dogSpaceNum = spaceNum;
	}

}