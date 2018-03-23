package se.lexicon.model;

import se.lexicon.model.foodChoiseBuilder.FoodServiceChoice;
import se.lexicon.model.priceConstruction.PassengerClass;

public class Passenger {

	private PassengerClass passengerClass;
	private FoodServiceChoice foodChoice;
	private int setSeatNumber;
	private String fullName;

	
	public Passenger(PassengerClass passengerClass, FoodServiceChoice foodChoice, int setSeatNumber, String fullName) {
		this.passengerClass = passengerClass;
		this.foodChoice = foodChoice;
		this.setSeatNumber = setSeatNumber;
		this.fullName = fullName;
	}

	public Passenger() {
		
	}
	
	
	
	public PassengerClass getPassengerClass() {
		return passengerClass;
	}

	public FoodServiceChoice getFoodChoice() {
		return foodChoice;
	}

	public int getSetSeatNumber() {
		return setSeatNumber;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFoodChoice(FoodServiceChoice foodChoice1) {
		this.foodChoice = foodChoice1;
		
	}

	public void setPassengerClass(PassengerClass passengerClass) {
		this.passengerClass = passengerClass;
		
	}

	public void setSeatNumber(int seatNumber) {
		this.setSeatNumber = seatNumber;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public double getTotalPrice() {
		return this.foodChoice.price() + this.passengerClass.price();
	}

}
