package gr.aueb.cf.ch5;

public class PowerApp {

    public static void main(String[] args) {
        for (int b = 1, p = 1; b <= 10; b++, p++) {
            System.out.printf("%,d\n", pow(b,p));
        }
    }

    /**
     *Calculates a^b
     * Delegation / Forwarding
     *
     * @param a  the base
     * @param b  the power
     * @return   the base raised to the power
     */
    public static long pow(long a, long b){
        return (long)Math.pow(a, b);
//        long result = 1;
//        for (int i = 0; i <= n; i++) {
//            result *= a;
//        }
//        return result;
    }
}
