package se.lexicon.ui;

import se.lexicon.exception.ExampleException;
import se.lexicon.model.FlightManager;
import se.lexicon.model.priceConstruction.Price;

import java.util.Scanner;

public class SystemUI {

	// Start the applications UI
	public void start() {

		// Loop-condition
		boolean isRunning = true;
		Menu menu = new Menu();
		FlightManager manager = new FlightManager(menu);
		// Try-with-resources to auto-close scanner on error or exit
		try(Scanner scanner = new Scanner(System.in)) {

			// Run at least once.
			do {

				// Inner loop error handling
				try {
					menu.mainMenue();

					//System.out.println("User input : ");
					String keyboard = scanner.next();

					switch (keyboard) {

						case "0":
							System.out.println("Exiting program...");
							isRunning = false;
							break;
						case "1":
							manager.bookFlight();
							isRunning = true;
							break;
						case "2":
							manager.calncelFlight();
							isRunning = true;
							break;

						case "3":
							manager.displayReservation();
							isRunning = true;
							break;
					 case "4":
					 manager.displayFinancialStatment();
					 isRunning = true;
											break;
						default:
							System.out.println(keyboard + " is not a valid option. Please try again.");

					}

					// Catch any and all program-specific exceptions here to de-clutter your switch-case
					// in case of checked and/or custom exceptions.

				} catch (Exception e) {
					System.out.println("Exception caught in inner try : " + e.getMessage());

				}

			} while (isRunning);

		} catch (Exception e) {
			System.out.println("Exception caught in outer try : " + e.getMessage());

		} finally {

			// Any tasks needed for cleaning up/saving/etc should be performed here.
			// The scanner auto-closes so don't worry about that.

		}

	}



}
