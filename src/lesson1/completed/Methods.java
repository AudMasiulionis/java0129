package lesson1.completed;

public class Methods {
    public static void main(String[] args) {
        int number = method1(1);
        int number1 = method2(1);
        int sum = method3(1,2);

        method5();
    }

    static int method1(int a){
        return a;
    }

    static int method2(int a){
        System.out.println(a);
        return a;
    }

    static int method3(int a, int b){
        int sum;
        sum = a + b;
        return sum;
    }

    static double toMiles(double kilometer){
        return kilometer * 0.621371192;
    }

    static void method5(){
        System.out.println("I print something!");
    }

    static boolean method6(){
        return 5>3;
    }
}
