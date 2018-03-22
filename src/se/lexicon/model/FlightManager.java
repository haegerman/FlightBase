package se.lexicon.model;

import se.lexicon.model.priceConstruction.Price;
import se.lexicon.ui.Menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FlightManager {

	Menu menu = new Menu();
	private ArrayList<Boolean> seatNumber;
	private boolean isFull;
	private boolean isFullBusiness, isFullEconomy;
	private Price price;
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
		if (!isFull) {
			int choice = menu.seatSelectorMenu();
			switch (choice) {
			case 0:
				System.exit(choice); // Can simply make this return to the calling.
			case 1:
				fixBusinessClassSeat();
				break;
			case 2:
				fixEconomyClassSeat();
				break;

			}
			choice = menu.foodSelectorMenu();
			switch (choice) {
			case 0:
				System.exit(choice);
			case 1:
				//TODO:
				break;
			case 2:
				//TODO:
				break;
			}

		}
	}


	public void fixBusinessClassSeat(){
		// System.out.println(seatNumber.size());
		if (!isFullBusiness){
			Scanner sc = new Scanner(System.in);
			int counter = 0;
			System.out.println("\t Please choose a seat number from: ");
			for (int i = 0; i < 5; i++ ) {
				if (!seatNumber.get(i)){
					System.out.println(i + 1);
				}
				++counter;  
			}
			if(--counter < 5){
				int choice = sc.nextInt();
				seatNumber.add(--choice, true);
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
		if (!isFullEconomy) {
			System.out.println("\t Please choose a seat number from: ");
			for (int i = 5; i < 10; i++) {
				if (!seatNumber.get(i)){
					System.out.println(i + 1);
				}
				++counter;  
			}
			if(--counter < 10){
				int choice = sc.nextInt();
				seatNumber.add(--choice, true);
			}else {
				isFullEconomy = true;
				System.out.println("Sorry no available seat: ");
				
			}
			sc.close();
		}
	}
}