package com.sda.weather.UserInterface;

import java.util.Scanner;

public class UserInterface {
    public void run() {
        System.out.println("Weather App is running.");
        Scanner keyboard = new Scanner(System.in);

        while (true) {    //Main UserInterface loop.
            System.out.println("Weather App");
            System.out.println("What do you want to do?");
            System.out.println("1. Add a localization to database.");
            System.out.println("2. Show database.");
            System.out.println("3. Show weather details from weather service.");

int decision = keyboard.nextInt();

switch(decision){
    case 1:
createLocalization();
        break;
    case 2:
getAllLocalizations();
        break;
    case 3:
        return;

}

        }


    }



}
