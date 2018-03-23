package se.lexicon.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import se.lexicon.model.foodChoiseBuilder.FoodServiceChoice;
import se.lexicon.model.priceConstruction.PassengerClass;
import se.lexicon.model.priceConstruction.Price;
import se.lexicon.model.types.Beverage;
import se.lexicon.model.types.BreakfastBusiness;
import se.lexicon.model.types.BreakfastEconomy;
import se.lexicon.model.types.LunchAndDinnerBusiness;
import se.lexicon.model.types.LunchAndDinnerEconomy;
import se.lexicon.ui.Menu;

public class FlightManager {

	Menu menu = new Menu();
	private ArrayList<Boolean> seatNumber;
	FoodServiceChoice.ChoiceBuilder foodServiceChoice = new FoodServiceChoice.ChoiceBuilder();
	private boolean isFull;
	private boolean isFullBusiness, isFullEconomy;
	private Price price;
	Beverage beverage;
	private PassengerClass passengerClass;
	private Map<String, Integer> reservation; // Name and seat number NOTE: price is related to seat no

	public FlightManager(Menu menu) {
		this.menu = menu;
		this.seatNumber = new ArrayList<>(10);
		//int last = seatNumber.size();
		int last = 10;

		for (int i = 0; i < last; i++ ) {
			seatNumber.add(i, Boolean.FALSE);
		}

		this.isFull = false;
		this.isFullBusiness = false;
		this.isFullEconomy = false;
		this.reservation = new HashMap<>(10);
	}

	public ArrayList<Boolean> getSeatNumber() {
		return seatNumber;
	}

	public boolean isFull() {
		return isFull;
	}

	public Price getPrice() {
		return price;
	}

	/*
        public Map<String, Map<Integer, Integer>> getReservation() {
            return reservation;
        }
	 */
	public void bookFlight() {
		Scanner sc = new Scanner(System.in);
		if (!isFull) {
			int choice = menu.seatSelectorMenu();
			switch (choice) {
			case 0:
				System.exit(choice); // Can simply make this return to the calling.
			case 1:
				this.passengerClass = PassengerClass.BUSINESS;
				fixBusinessClassSeat();
				break;
			case 2:
				this.passengerClass = PassengerClass.ECONOMY;
				fixEconomyClassSeat();
				break;

			}
			choice = menu.foodSelectorMenu();
			switch (choice) {
			case 0:
				System.exit(choice);
			case 1:
				fixBreakfast(passengerClass);
				System.out.println("Will you choose dinner and/or lunch? yes/no");
				String choise = sc.nextLine();
				if(choise.equals(choise))
					fixLunchAndDinner(passengerClass);
				break;
			case 2:
				fixLunchAndDinner(passengerClass);

				FoodServiceChoice foodChoice = foodServiceChoice.build();
				break;

			}
			Scanner sc1 = new Scanner(System.in);
			choice = menu.beverageSelectorMenu();
			switch (choice) {
			case 0:
				System.exit(choice);
			case 1:
				//String type = sc1.nextLine();
				//fixBeverage(beverage.setType(type)));
				fixBeverage(beverage.NON_ALCHOLIC_BEVERAGE);
				System.out.println("Will you have alcholic drinc? yes/no");
				String choise = sc1.nextLine();
				if(choise.equals("yes"))
					fixBeverage(Beverage.ALCHOLIC);
				break;
			case 2:
				fixLunchAndDinner(passengerClass);
				//After adding Breakfast dinner and lunch choices
				//Build the whole food choice instance.
				// TODO: Price presentation, cost profit analysis and receipt generation
				// TODO: Refactoring to decrease code duplication and 
				//       adhere to single responsibility principle.
				FoodServiceChoice foodChoice = foodServiceChoice.build();
				break;

			}
		}

	}
	private void fixBeverage(Beverage beverage) {
		foodServiceChoice.beverage(beverage);
	}

	private void fixLunchAndDinner(PassengerClass passengerClass2) {
		displayLunchAndDinner(passengerClass2);
		Scanner cin = new Scanner(System.in);
		int choice = cin.nextInt();
		if(passengerClass2.equals(PassengerClass.ECONOMY)) {
			switch (choice) {
			case 1:
				foodServiceChoice.lunchDinnerE(LunchAndDinnerEconomy.Smoked_Gouda_cheeseburger);
				break;

			case 2:
				foodServiceChoice.lunchDinnerE(LunchAndDinnerEconomy.UNO_pepperoni_deep_dish_pizza);
				break;
			}
		}else {
			switch (choice) {
			case 1:
				foodServiceChoice.lunchDinnerB(LunchAndDinnerBusiness.Cheeseburger);
				break;

			case 2:
				foodServiceChoice.lunchDinnerB(LunchAndDinnerBusiness.Chipotle_chicken_club_sandwich);
				break;
			case 3:
				foodServiceChoice.lunchDinnerB(LunchAndDinnerBusiness.Mezze_sampler);
				break;
			case 4:
				foodServiceChoice.lunchDinnerB(LunchAndDinnerBusiness.Smoked_Gouda_cheeseburger);
				break;
			case 5:
				foodServiceChoice.lunchDinnerB(LunchAndDinnerBusiness.Thai_style_chicken_sandwich);
				break;
			case 6:
				foodServiceChoice.lunchDinnerB(LunchAndDinnerBusiness.UNO_pepperoni_deep_dish_pizza);
				break;

			}
		}
	}

	private void displayLunchAndDinner(PassengerClass passengerClass2) {

		if(passengerClass2.equals(PassengerClass.ECONOMY)) {
			System.out.println("Select your choice, we have:"
					+ "\t\n 1)" + LunchAndDinnerEconomy.Smoked_Gouda_cheeseburger
					+ "\t\n 2)" + LunchAndDinnerEconomy.UNO_pepperoni_deep_dish_pizza);		
		}else {
			System.out.println("Select your choice, we have:"
					+ "\t\n 1)" + LunchAndDinnerBusiness.Cheeseburger
					+ "\t\n 2)" + LunchAndDinnerBusiness.Chipotle_chicken_club_sandwich
					+ "\t\n 3)" + LunchAndDinnerBusiness.Mezze_sampler
					+ "\t\n 4)" + LunchAndDinnerBusiness.Smoked_Gouda_cheeseburger
					+ "\t\n 5)" + LunchAndDinnerBusiness.Thai_style_chicken_sandwich
					+ "\t\n 6)" + LunchAndDinnerBusiness.UNO_pepperoni_deep_dish_pizza);	
		}
	}

	private void fixBreakfast(PassengerClass passengerClass2) {
		displayBreakfastMenu(passengerClass);
		Scanner cin = new Scanner(System.in);
		int choice = cin.nextInt();
		if(passengerClass2.equals(PassengerClass.ECONOMY)) {
			switch (choice) {
			case 1:
				foodServiceChoice.breakfastE(BreakfastEconomy.Chobani_Greek_yogurt_and_fresh_fruit);
				break;

			case 2:
				foodServiceChoice.breakfastE(BreakfastEconomy.Sourdough_breakfast_sandwich);
				break;
			}
		}else {
			switch (choice) {
			case 1:
				foodServiceChoice.breakfastB(BreakfastBusiness.Chobani_Greek_yogurt_and_fresh_fruit);
				break;

			case 2:
				foodServiceChoice.breakfastB(BreakfastBusiness.Sourdough_breakfast_sandwich);
				break;
			case 3:
				foodServiceChoice.breakfastB(BreakfastBusiness.Southwestern_style_omelet);
				break;
			case 4:
				foodServiceChoice.breakfastB(BreakfastBusiness.Fresh_start_breakfast);
				break;

			}
		}

	}

	private void displayBreakfastMenu(PassengerClass passengerClass2) {
		if(passengerClass2.equals(PassengerClass.ECONOMY)) {
			System.out.println("Select your choice, we have:"
					+ "\t\n 1)" + BreakfastEconomy.Chobani_Greek_yogurt_and_fresh_fruit
					+ "\t\n 2)" + BreakfastEconomy.Sourdough_breakfast_sandwich);		
		}else {
			System.out.println("Select your choice, we have:"
					+ "\t\n 1)" + BreakfastBusiness.Chobani_Greek_yogurt_and_fresh_fruit
					+ "\t\n 2)" + BreakfastBusiness.Sourdough_breakfast_sandwich
					+ "\t\n 3)" + BreakfastBusiness.Southwestern_style_omelet
					+ "\t\n 4)" + BreakfastBusiness.Fresh_start_breakfast);	
		}
	}
	public void fixBusinessClassSeat(){
		// System.out.println(seatNumber.size());
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		String fullName;
		if (!isFullBusiness){
			System.out.print("Enter full name: ");
			fullName = sc.nextLine();
			System.out.println("\t Please choose a seat number from: ");
			for (int i = 0; i < 5; i++ ) {
				if (!seatNumber.get(i)){
					System.out.print("\t" + (i + 1) + ", ");
				}
				++counter;  
			}
			System.out.print("\n\t:");
			if(--counter < 5){
				int choice = sc.nextInt();
				seatNumber.add(--choice, true);
				reservation.put(fullName, choice);
			}

			else {
				isFullBusiness = true;
				System.out.println("Business calass is full will you try Economy class? (yes/no)");
				String alternative = sc.nextLine();
				if (alternative.equals("yes")) {
					fixEconomyClassSeat();
				}
				sc.close();
			}
		}
	}

	public void fixEconomyClassSeat(){
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		String fullName;

		if (!isFullEconomy) {
			System.out.print("Enter full name: ");
			fullName = sc.nextLine();
			System.out.println("\t Please choose a seat number from: ");
			for (int i = 5; i < 10; i++) {
				if (!seatNumber.get(i)){
					System.out.print("\t" + (i + 1) + ", ");
				}
				++counter;  
			}
			System.out.print("\n\t:");
			if(--counter < 10){
				int choice = sc.nextInt();
				seatNumber.add(--choice, true);
				reservation.put(fullName, choice);
			}else {
				isFullEconomy = true;
				System.out.println("Sorry no available seat: ");
			}
			sc.close();
		}
	}

	public void calncelFlight() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the name of the passenger:");
		String name = sc.nextLine();
		System.out.println("");
		if (reservation.containsKey(name)) {
			reservation.remove(name);
		}else {
			System.out.println("There is no passenger with this name.");
		}
		
		//sc.close();
	}

	public void displayReservation() {
		for (String name : reservation.keySet()) {
			System.out.println("====================================");
			System.out.println("Name: " + name);
			System.out.println("Seat number: " + reservation.get(name));
			System.out.println("====================================");
		}
	}
}