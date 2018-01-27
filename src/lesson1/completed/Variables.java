package lesson1.completed;

public class Variables {

    public static void main(String[] args) {
        //1
        boolean isActive = true;
        byte someByte = 50; //-128,127
        short someShort = 15000; // -32678, 32767
        char someChar = '1';
        char uniChar = '\u00B1'; //UTF8
        int someInt = 2569412; //-2147483648, 2147483648 32bits
        long someLong = 1; // -2^63, 2^63-1 64bits
        float someFloat = 1.222222f;//32 bits
        double someDouble = 1.123123123123123123123123112321312312321312312d; //64bits
        String someString = "this is a string";

        System.out.println(isActive);
        System.out.println(someByte);
        System.out.println(someShort);
        System.out.println(someChar);
        System.out.println(uniChar);
        System.out.println(someInt);
        System.out.println(someLong);
        System.out.println(someFloat);
        System.out.println(someDouble);
        System.out.println(someString);

        //2
        int a = 4;
        int b = 3;

        int sum = a + b;
        int multiplication = a*b;
        int division = 4/3;
        double division1 = 4/3;
        int diff = a - b;
        a++;
        b--;

        //3
        int a1 = 4;
        int b1 = 3;

        boolean equal = a1 == b1;
        boolean aLarger = a1 > b1;
        boolean bLarger = a1 < b1;
        boolean notEqual = a1 != b1;

        //4
        String string1 = "String ";
        String string2 = "another String";
        String combined = string1 + string2;
        System.out.println(combined);
    }
}
