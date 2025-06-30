package org.example;

import java.util.*;

public class Main {
    public static double convertToFahrenheit(float tempInCelsius) {
        return (double) (9 * tempInCelsius) / 5 + 32;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        float temperature = userInput.nextFloat();

        System.out.println("Temperature in Fahrenheit: " + String.format("%.2f", convertToFahrenheit(temperature)));
    }
}