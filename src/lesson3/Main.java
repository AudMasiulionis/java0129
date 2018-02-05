package lesson3;

import java.util.Scanner;

public class Main {

    static int correctAnswers = 0;

    public static void main(String[] args) {

        askQuestion("Lietuvos sostine", "Vilnius");
        askQuestion("Latvijos sostine", "Ryga");

        if(correctAnswers == 2){
            System.out.println("Laimejai");
        }
        else{
            System.out.println("Pralaimejai");
        }
    }

    static void askQuestion(String klausimas, String atsakymas){
        Scanner sc = new Scanner(System.in);
        System.out.println(klausimas);
        String unserInput = sc.next();
        if(unserInput.equals(atsakymas)){
            System.out.println("Tesingai");
            correctAnswers++;
        }
    }

}
