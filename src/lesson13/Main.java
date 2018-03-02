package lesson13;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

    }




    static int intInput() {
        try {
            System.out.println("Ivesk skaicius");
            Scanner sc = new Scanner(System.in);
            return sc.nextInt();
        } catch (Exception ex){
            System.out.println("Klaidinga ivestis");
            return intInput();
        }
    }


//     try {
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        double result = input / (4 - input);
//        System.out.println(result);
//    } catch (InputMismatchException ex) {
//        System.out.println("Wrong input!");
//    } catch (ArithmeticException ex) {
//        System.out.println("Can't divide by zero");
//    } finally {
//        System.out.println("Operation finished");
//    }


    private static void login(String userName, String password) throws Exception {
        final String secretUserName = "user";
        final String secretPassword = "123";

        if (userName.equals(secretUserName) && password.equals(secretPassword)) {
            System.out.println("Welcome to the system");
        } else {
            throw new Exception("Invalid login");
        }
    }

    private static int getInput() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input number");
            return sc.nextInt();
        } catch (Exception ex) {
            System.out.println("Invalid input");
            return getInput();
        }
    }

    private static void printExists(int index) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 7, 7};
        try {
            int item = arr[index];
            System.out.println("Item exists " + item);
        } catch (Exception e) {
            System.out.println("Item does not exist");
        }
    }
}
