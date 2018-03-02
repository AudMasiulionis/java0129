package lesson14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ATM atm = new ATM();
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        do {
            if (!atm.isPinCodeValid()) {
                System.out.println("Enter pin");
                atm.enterPin(sc.nextInt());
            }

            System.out.println("1. Add money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Show balance");
            System.out.println("4. Show transactions");
            System.out.println("5. Exit");

            int userInput = sc.nextInt();
            try {
                switch (userInput) {
                    case 1:
                        System.out.println("Enter amount");
                        atm.addMoney(sc.nextInt());
                        break;
                    case 2:
                        System.out.println("Enter amount");
                        atm.withdrawMoney(sc.nextInt());
                        break;
                    case 3:
                        int balance = atm.showBalance();
                        System.out.println("Your balance: " + balance);
                        break;
                    case 4:
                        System.out.println(atm.toString());
                        break;
                    case 5:
                        atm.close();
                        run = false;
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (run);
    }
}
