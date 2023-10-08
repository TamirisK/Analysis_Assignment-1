package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Assignment 1 by Abildayeva T");
        System.out.println("Enter task number & letter. For example: 1a");

        String task = scanner.nextLine();

        switch(task) {
            case "1a":
                System.out.println("Task 1a. Enter n: ");

                int n1a = scanner.nextInt();
                int sum1a = 0;

                for (int i = 3; i <= n1a + 1; i++) {
                    sum1a++;
                }

                System.out.println("Answer for task 1a. Sum: " + sum1a);

            case "1b":
                System.out.println("Task 1b. Enter n: ");

                int n1b = scanner.nextInt();
                int sum1b = 0;

                for (int i = 3; i <= n1b + 1; i++) {
                    sum1b += i;
                }

                System.out.println("Answer for task 1b. Sum: " + sum1b);

            case "1c":
                System.out.println("Task 1c. Enter n: ");

                int n1c = scanner.nextInt();
                int sum1c = 0;

                for (int i = 0; i < n1c; i++) {
                    sum1c += i * (i + 1);
                }

                System.out.println("Answer for task 1c. Sum: " + sum1c);

            case "1d":
                System.out.println("Task 1d. Enter n: ");

                int n1d = scanner.nextInt();
                double sum1d = 0;

                for (int j = 3; j <= n1d; j++) {
                    sum1d += Math.pow(3, j + 1);
                }

                System.out.println("Answer for task 1d. Sum: " + sum1d);

            case "1e":
                System.out.println("Task 1e. Enter n: ");

                int n1e = scanner.nextInt();
                int sum1e = 0;

                for (int i = 1; i <= n1e; i++) {
                    for (int j = 1; j <= n1e; j++) {
                        sum1e += i * j;
                    }
                }

                System.out.println("Answer for task 1e. Sum: " + sum1e);

            case "1f":
                System.out.println("Task 1f. Enter n: ");

                int n1f = scanner.nextInt();
                double sum1f = 0;

                for (int i = 1; i <= n1f; i++) {
                    sum1f += 1.0 / (i * (i + 1));
                }

                System.out.println("Answer for task 1f. Sum: " + sum1f);

            case "2a":
                System.out.println("Task 2a. Enter n: ");

                int n2a = scanner.nextInt();
                int sum2a = 0;

                for (int i = 0; i < n2a; i++) {
                    sum2a += (int) Math.pow(i * i + 1, 2);
                }

                System.out.println("Answer for task 2a. Sum: " + sum2a);

            case "2b":
                System.out.println("Task 2b. Enter n: ");

                int n2b = scanner.nextInt();
                double sum2b = 0;

                for (int i = 2; i < n2b; i++) {
                    sum2b = Math.log10(i * i);
                }

                System.out.println("Answer for task 2b. Sum: " + sum2b);

            case "2c":
                System.out.println("Task 2c. Enter n: ");

                int n2c = scanner.nextInt();
                int sum2c = 0;

                for (int i = 1; i <= n2c; i++) {
                    sum2c += (i + 1) * (int)Math.pow(2, i - 1);
                }

                System.out.println("Answer for task 2c. Sum: " + sum2c);

            case "2d":
                System.out.println("Task 2d. Enter n: ");

                int n2d = scanner.nextInt();
                int sum2d = 0;

                for (int i = 0; i < n2d; i++) {
                    for (int j = 0; j < i; j++) {
                        sum2d += (i + j);
                    }
                }

                System.out.println("Answer for task 2d. Sum: " + sum2d);
        }
    }
}
