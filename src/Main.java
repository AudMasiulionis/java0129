import coffee.CoffeeMachine;
import coffee.Products;

import java.util.Scanner;

public class Main {
    private static CoffeeMachine coffeeMachine = new CoffeeMachine(new Products(10,10,10,10));
    private static boolean runProgram = true;

    public static void main(String[] args) {
        do {
            printMenu();
            executeUserInput();
        } while (runProgram);
    }

    private static void printMenu() {
        System.out.println("1. Order coffee");
        System.out.println("2. Clean");
        System.out.println("3. Refill products");
        System.out.println("4. Status");
        System.out.println("5. Exit");
    }

    private static void executeUserInput() {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        switch (input) {
            case 1:
                orderCoffee();
                break;
            case 2:
                coffeeMachine.clean();
                break;
            case 3:
                refillProducts();
                break;
            case 4:
                System.out.println(coffeeMachine.toString());
                break;
            case 5:
                runProgram = false;
                break;
            default:
                System.out.println("Wrong input.");
                break;
        }
    }

    private static void refillProducts() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sugar count");
        int sugarCount = sc.nextInt();
        System.out.println("Enter bean count");
        int beanCount = sc.nextInt();
        System.out.println("Enter water count");
        int waterCount = sc.nextInt();
        System.out.println("Enter milk count");
        int milkCount = sc.nextInt();
        coffeeMachine.addProducts(sugarCount, beanCount, waterCount, milkCount);
    }

    private static void orderCoffee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What kind of coffee you want to order?");
        String input = sc.next();
        coffeeMachine.makeCoffee(input);
    }

}
