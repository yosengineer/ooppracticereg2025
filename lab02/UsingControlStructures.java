package lab02;

import java.util.Scanner;

public class UsingControlStructures {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        if (age < 18) {
            System.out.println("You are NOT enough to drive!");
        } else {
            System.out.println("You are old enough to drive!");
        }

        int i = 100;
        while (i > 0) {
            if (i % 2 != 0)
                System.out.println(i);
            i--;
        }

    }
}
