package lesson2.completed;

import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) {
        //1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int input = sc.nextInt();
        System.out.println(input);

        //2
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter number");
        int input1 = sc.nextInt();

        System.out.println("Enter another number");
        int input2 = sc.nextInt();

        int sum = sum(input1, input2);
        System.out.println(sum);

        //3
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter any string");
        String inputString = sc2.next();
        System.out.println(inputString);

        //4
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter any string");
        String inputString1 = sc2.next();
        System.out.println("Enter another any string");
        String inputString2 = sc2.next();

        String combined = inputString1 + " " + inputString2;
        System.out.println(combined);

        //7
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc4.nextInt();
        if (num > 0){
            System.out.println("Number is positive");
        }else {
            System.out.println("Number is negative");
        }

        //8
        Scanner sc5 = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc5.nextInt();
        if (age > 100 || age < 0){
            System.out.println("Invalid input");
        }

        if (age >= 18){
            System.out.println("You can vote!");
        }

        //9
        Scanner sc6 = new Scanner(System.in);
        System.out.println("Enter your age");
        int number = sc6.nextInt();

        if (number < 0){
            System.out.println("Negative");
        }
        else if (number > 100){
            System.out.println("More than 100");
        }
        else if (number > 40 && number < 60){
            System.out.println("Is between 40 and 60");
        }
        else{
            System.out.println("Other message");
        }
    }

    static int sum(int a, int b){
        return a + b;
    }

    //5
    static void inputAndSum(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        System.out.println("Enter another number");
        int num1 = sc.nextInt();

        int sum = num + num1;
        System.out.println(sum);
    }
}
