package gr.aueb.cf.ch4;

public class UnicodeApp {

    public static void main(String[] args) {
        int codePoint = 0x1F600;

        System.out.println("Smiley: \uD83D\uDE03"); // one way
        System.out.print("Smile:");
        System.out.println(Character.toChars(codePoint)); // second way
    }
}
