package gr.aueb.cf.ch20;

public class RegExMain {

    public static void main(String[] args) {
        String s = "A8ana Androutsos";
        String date = "21/04/1989";
        String str = "Athens Uni of      Eco      and    Bus";

//        System.out.println(beginsWithOneUpperCaseAndEndsIning(s));
        System.out.println(whitespaceDigit(s));
        System.out.println(anySymbolDigit(s));
        System.out.println(isEmail(s));
        System.out.println(isDate(date));

        String[] tokens = doSplit(str);
        for (String token : tokens) {
            System.out.print(token + " ");
        }
        System.out.println();

        System.out.println(doReplace(str));
        System.out.println(doReplaceBackReference(s));
    }


    /**
     * Checks matches if input string
     * is "red"
     * @param s
     * @return
     */
    public static boolean isRed(String s) {
        return s.matches("red");
    }

    /**
     * Checks matches if input string is
     * red OR green
     * @param s
     * @return
     */
    public static boolean isRedOrGreen(String s) {
        return s.matches("red|green");
    }

    /**
     * Checks matches if input string is "red" or "Red OR "green" or "Green"
     * @param s
     * @return
     */
    public static boolean isrRedOrgGreen(String s) {
        return s.matches("[rR]ed|[gG]reen");
    }

    public static boolean beginsWithOneUpperCaseAndEndsIning(String s) {
        return s.matches("[A-Z]ing");
    }

    public static boolean isOneLetterEndsIning(String s) {
        return s.matches("[A-Za-z]ing");
    }

    public static boolean whitespaceDigit(String s) {
        return s.matches("^\\s\\d$");
    }

    public static boolean anySymbolDigit(String s) {
//        return s.matches(".\\d");
        return s.matches(".[0-9]");
    }

    public static boolean isEmail(String s) {
        return s.matches("\\w*\\.?\\w+@\\w+\\.[a-z]{2,4}");
    }

    public static boolean isDate(String s) {
        return s.matches("\\d{2}/\\d{2}/\\d{4}");
    }

    public static String[] doSplit(String s) {
        return s.split("\\s+");
    }

    public static String doReplace(String s) {
        return s.replaceAll("\\s+", " ");
    }

    public static String doReplaceBackReference(String s) {
        return s.replaceAll("(.+)\\s+(.+)", "$2 $1");
    }
}
