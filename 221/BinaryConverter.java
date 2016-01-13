/**
 * Jeremy Karbowski
 * COSC 221 / Section 00 / Winter 2016
 * Machine Problem #1 (conversion)
 * Program to convert from decimal to binary notation
 */
import java.util.Scanner;

public class BinaryConverter {
    public static void main(String[] args) {
        int num;
        boolean running = true;
        Scanner input = new Scanner(System.in);

        while(running) {
            System.out.println("\t1. Convert decimal to binary");
            System.out.println("\t2. Convert binary to decimal");
            System.out.println("\t3. Exit");

            num = input.nextInt();

            switch(num) {
                case 1:
                    System.out.print("Enter decimal number: ");
                    num = input.nextInt();
                    System.out.println("The binary number is: " + toBinary(num));
                    break;
                case 2:
                    System.out.print("Enter binary number: ");
                    num = input.nextInt();
                    System.out.println("The decimal number is: " + toDecimal(num));
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid input");
                    running = false;
                    break;
            }
        }
        System.out.println("\tHave a nice day");
    }

    public static int toBinary(int num) {
        if(num != 0) {
            int binary = 0;
            for(int i = 0; num > 0; i++) {
                binary += (num % 2) * (int)(Math.pow(10, i));
                num = num / 2;
            }
            return binary;
        }
        return 0;
    }

    public static int toDecimal(int num) {
        if(num != 0) {
            int decimal = 0;
            for(int i = 0; num > 0; i++) {
                decimal += (num % 10) * (int)(Math.pow(2,i));
                num = num / 10;
            }
            return decimal;
        }
        return 0;
    }
}
