package gr.aueb.cf.ch2;

/**
 * A frog wants to go to the other side of the road
 * Frog is currently located at position X and wants
 * to go at a position equal or greater to Y. The frog
 * jumps a fixed distance D.
 * Find the number of the jumps
 */

public class FrogJumpsApp {

    public static void main(String[] args) {
        int target = 85;
        int start = 10;
        int hop = 30;
        int jumps ;

        jumps = (int)Math.ceil((target - start) / (double)hop);

        System.out.println("Jumps : " + jumps);
    }
}
