package se.lexicon.ui;

import se.lexicon.model.types.*;

import java.util.Scanner;

public class Menu {

    Scanner cin;

    {

        cin = new Scanner(System.in);
    }

    public void  mainMenue(){
        System.out.println("Please enter your choice" +
                "\n\t 0) Exit" +
                "\n\t 1) Book a flight" +
                "\n\t 2) Cansel a flight");
        System.out.print(":");
    }


    public int seatSelectorMenu() {
        System.out.println("Select from Business or Economy class" +
                "\n\t 0) Exit" +
                "\n\t 1) Business class" +
                "\n\t 2) Economy class");
        System.out.print(":");
        return cin.nextInt();
    }

    public int foodSelectorMenu() {
        System.out.println("Please enter your choice" +
                "\n\t 0) Exit" +
                "\n\t 1) Breakfast " +
                "\n\t 2) Lunch and / or Dinner");
        System.out.print(":");
        return cin.nextInt();
    }
    public int beverageSelectorMenu() {
        System.out.println("Please enter your choice" +
                "\n\t 0) Exit" +
                "\n\t 1) Non Alcholic " +
                "\n\t 2) Alcholic");
        System.out.print(":");
        return cin.nextInt();
    }

}
