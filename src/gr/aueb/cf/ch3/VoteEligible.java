package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Checks the age from user
 * and checks if it is eligible
 * to vote
 */

public class VoteEligible {

    public static void main(String[] args) {
        final int VOTING_AGE = 18;
        Scanner sc = new Scanner(System.in);
        boolean isEligibleVote = false;
        int userAge = 0;

        System.out.println("Please insert your age: ");
        userAge = sc.nextInt();

        isEligibleVote = userAge >= VOTING_AGE;

        System.out.printf("User is eligible to vote: %b", isEligibleVote);
    }
}
