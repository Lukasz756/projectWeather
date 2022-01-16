package com.sda.weather.userinterface;

import java.util.Scanner;

public class userInterface {

    public void run() {
        System.out.println("Weather App is running.\n");
        Scanner keyboard = new Scanner(System.in);

        while (true) {    //Main UserInterface loop.
            System.out.println("Weather App");
            System.out.println("What do you want to do?");
            System.out.println("1. Add a localization.");
            System.out.println("2. Show localizations.");
            System.out.println("3. Show weather forecast.");
            System.out.println("4. Close app.");

            int decision = keyboard.nextInt();

            switch (decision) {
                case 1:
                    createLocalization();
                    break;
                case 2:
                    getAllLocalizations();
                    break;
                case 3:
                    getWeatherDetails();
                    break;
                case 4:
                    return;
            }
        }
    }

    private void getWeatherDetails() {
    }

    private void createLocalization() {
    }

    private void getAllLocalizations() {
    }
}
