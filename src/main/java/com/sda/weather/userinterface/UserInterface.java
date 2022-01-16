package com.sda.weather.userinterface; // todo you changed this line but a package name is still the same

import java.util.Scanner;

public class UserInterface {

    public void run() {
        System.out.println("Weather App is running.");
        Scanner keyboard = new Scanner(System.in);

        while (true) {    //Main UserInterface loop.
            System.out.println("Weather App");
            System.out.println("What do you want to do?");
            System.out.println("1. Add a localization to database."); // todo just add a localization
            System.out.println("2. Show database."); // todo change this message, we want to obtain an information about our localizations
            System.out.println("3. Show weather details from weather service."); // todo it's a weather forecast
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
