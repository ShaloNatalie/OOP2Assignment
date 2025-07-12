package CHALLENGES;

import java.util.Scanner;
public class scanner{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Price:");
        double price = scanner.nextDouble();

        if (price<10000.00){
            System.out.println("Affordable");
        }
        else {
            System.out.println("Expensive");
        }
        scanner.close();
    }
}
