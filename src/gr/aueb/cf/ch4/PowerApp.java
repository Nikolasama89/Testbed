package gr.aueb.cf.ch4;

import java.math.BigInteger;

public class PowerApp {

    public static void main(String[] args) {
        //bigInteger bigResult = new BigInteger ("1"); IF NUMBER WAS TOO BIG(EX POWER 100)
        int base = 2;
        int power = 10;
        int result = 1;

        for (int i = 1; i <= power; i++){
            result *= base;
            //bigResult = bigResult.multiply(BigInteger.valueOf(base)); // THIS IS THE WAY TO DEAL WITH BIG NUMBER

        }

        System.out.println("Result: " + result);
        //System.out.println("Result: " + bigResult);

    }
}
