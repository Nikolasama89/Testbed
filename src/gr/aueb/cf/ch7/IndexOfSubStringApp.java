package gr.aueb.cf.ch7;

public class IndexOfSubStringApp {
    String cf = "Coding Factory";

    int positionOf = cf.indexOf("o"); // 1o "o"
    int getPositionOfSecond = cf.indexOf("o", 2);
    int lastIndexOf = cf.lastIndexOf("o"); // starts counting from the right

    String cf2 = cf.substring(0); // returns the whole string from index 0(zero).
}
