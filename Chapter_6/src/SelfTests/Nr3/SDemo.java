package SelfTests.Nr3;

import java.util.Stack;

// Demonstrate the Stack class.
public class SDemo {
    public static void main(String args[]) {
        // construct 10-element empty stack
        Stack stk1 = new Stack();

        char name[] = {'T', 'o', 'm'};

        // construct stack from array
        Stack stk2 = new Stack();

        char ch;
        int i;

        // put some characters into stk1
        for(i=0; i < 10; i++)
            stk1.push((char) ('A' + i));

        // construct stack from another stack
        Stack stk3 = new Stack();

        //show the stacks.
        System.out.print("Contents of stk1: ");
        for(i=0; i < 10; i++) {
            ch = (char) stk1.pop();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Contents of stk2: ");
        for(i=0; i < 3; i++) {
            ch = (char) stk2.pop();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Contents of stk3: ");
        for(i=0; i < 10; i++) {
            ch = (char) stk3.pop();
            System.out.print(ch);
        }
    }
}