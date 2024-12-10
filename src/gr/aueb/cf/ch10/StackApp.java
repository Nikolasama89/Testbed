package gr.aueb.cf.ch10;

public class StackApp {
    static int[] myStack = new int[50];
    static int top = -1;

    public static void main(String[] args) {

    }

    public static void push(int num) throws Exception {
        try {
            if (isFull()) throw new Exception("Error stack is full!");
            myStack[++top] = num;

        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }


    public static boolean isEmpty() {
        return top == -1;
    }

    public static boolean isFull() {
        return top == myStack.length - 1;
    }

    public static void printStack() throws Exception{
        try {
            if (isEmpty()) {
                throw new Exception("Stack is Empty");
            }
            for (int i = 0; i <= top; i++) {
                System.out.print(myStack[i] + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }

    }
}
