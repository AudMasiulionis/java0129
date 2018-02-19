package lesson6;

import lesson6.example.Example;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverse(123));
    }

    static int digitCount(int number){
        int digitCount = 1;
        while (number / 10 > 0){
            number = number / 10;
            digitCount++;
        }
        return digitCount;
    }

    static int reverse(int number){
        int digitCount = digitCount(number);
        int result = 0;
        while (digitCount > 0){
            double temp = (int)(number / Math.pow(10,digitCount - 1));
            result += temp * Math.pow( 10, digitCount - 1);
            digitCount--;
        }
        return result;
    }

}
