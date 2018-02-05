package lesson3;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("1. Pirmas");
        System.out.println("2. Antras");
        System.out.println("3. Trecias");

        Scanner sc = new Scanner(System.in);
        System.out.println("Ivesti pasirinkima");
        int userInput = sc.nextInt();

        switch (userInput) {
            case 1:
                System.out.println("Pirmas");
                case1();
                break;
            case 2:
                System.out.println("Anrtas");
                break;
            case 3:
                System.out.println("Trecias");
                break;
            default:
                System.out.println("Blogas pasirinkimas");
                break;
        }
    }

    static void case1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ivesk du skaicius");
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int sum = input1 + input2;
        System.out.println("Suma yra " + sum);
    }

}
