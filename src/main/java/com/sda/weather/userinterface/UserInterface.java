package com.sda.weather.userinterface;

import com.sda.weather.localization.LocalizationController;
import lombok.RequiredArgsConstructor;

import java.util.Scanner;

@RequiredArgsConstructor
public class UserInterface {

    private final LocalizationController localizationController;
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
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter city name.");
        String city = keyboard.nextLine();
        System.out.println("Enter country name.");
        String country = keyboard.nextLine();
        System.out.println("Enter region name.");
        String region = keyboard.nextLine();
        System.out.println("Enter longitude.");
        int longitude = keyboard.nextInt();
        System.out.println("Enter latitude.");
        int latitude = keyboard.nextInt();
        String requestBody = String.format("{\"city\":\"%s\",\"country\":\"%s\",\"region\":\"%s\",\"longitude\":\"%d\",\"latitude\":\"%d\"}"
                , city, country, region, longitude, latitude);
        String responseBody = localizationController.createLocalization(requestBody);
        System.out.println(responseBody);

    }

    private void getAllLocalizations() {
    }
}
