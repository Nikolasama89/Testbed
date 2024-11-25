package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Turn lights on ,
 * if it is raining AND the car is going > 100 OR it is night
 *
 */

public class LightsOn {

    public static void main(String[] args) {
        final int CAR_MAX_SPEED = 100;
        boolean isNight = false;
        boolean areLightsOn = false;
        boolean isCarRunning = false;
        boolean isRaining = false;
        int carSpeed = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert if it is raining:");
        isRaining = sc.nextBoolean();

        System.out.println("Is it night Outside?");
        isNight = sc.nextBoolean();

        System.out.println("What is the speed of the car?");
        carSpeed = sc.nextInt();

        isCarRunning = carSpeed > CAR_MAX_SPEED;

        areLightsOn = isRaining && (isCarRunning || isNight);

        System.out.println("Lights are on: " + areLightsOn);
    }
}
