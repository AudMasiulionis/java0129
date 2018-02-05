package lesson3;

public class Main1 {
    public static void main(String[] args) {

        int number = test(10);
        System.out.println(number);
        
//        int sk = 2;
//
//        switch (sk) {
//            case 55555:
//                break; // sk == 1
//            case 2:
//                System.out.println("2");
//                //nesustok
//            case 3:
//                System.out.println("Teisingas");
//                break; // sk == 2 || sk == 3
//
//            default:
//                System.out.println("Kitas sk");
//                break;
//        }
    }


    static int test(int i){
        int a = 0;
        if ( i == 1){
            a = 3;
        }
        else {
            a = 4;
        }
        return a;
    }
}
