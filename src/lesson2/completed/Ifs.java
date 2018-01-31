package lesson2.completed;

public class Ifs {
    public static void main(String[] args) {
        //1.1
        boolean isTrue = true;

        if (isTrue == true) {
            System.out.println("Tiesa");
        } else {
            System.out.println("Netiesa");
        }

        //1.2
        int num = 102;
        if (num > 100) {
            System.out.println("Didesnis uz 100");
        }

        //1.3
        int num1 = 102;
        if (num1 > 100) {
            System.out.println("Didesnis uz 100");
        } else {
            System.out.println("Mazesnis uz 100");
        }

        //1.4
        int num2 = 33;
        if (num2 < 100 && num2 > 0) {
            System.out.println("Skaicius yra 0..100 tarpe");
        } else {
            System.out.println("Skaiciaus apibreztame rezyje nera");
        }

    }

    //2.1
    static boolean checkIfNumberIsNegative(int num) {
        if (num > 0) {
            System.out.println("Skaicius teigiamas");
            return false;
        } else {
            System.out.println("Skaicius neigiamas");
            return true;
        }
    }

    //2.2
    static boolean numberIs3Digit(int num) {
        if (num > 99 && num < 1000) {
            return true;
        } else if (num < -99 && num > -1000) {
            return true;
        } else {
            return false;
        }
    }

    //2.3
    //be neigiamu skaiciu
    public static boolean isInRange(int number, int r1, int r2) {
        if (r1 > r2) {
            System.out.println("Pradinis rezis didesnis uz baigtini");
            return false;
        }

        if (number >= r1 && number <= r2) {
            System.out.println("Skacius yra reziuose");
            return true;
        } else {
            System.out.println("Skacius nera reziuose");
            return false;
        }
    }

    //2.3
    //su neigiamais skaiciais
    public static boolean isInRange1(int number, int r1, int r2) {

        if (r1 <= 0 || r2 <= 0) {
            if (r1 < r2) {
                System.out.println("Pradinis rezis didesnis uz baigtini");
                return false;
            }
            if (number <= r1 && number >= r2) {
                System.out.println("Skacius yra reziuose");
                return true;
            } else {
                System.out.println("Skacius nera reziuose");
                return false;
            }

        } else {
            if (r1 > r2) {
                System.out.println("Pradinis rezis didesnis uz baigtini");
                return false;
            }

            if (number >= r1 && number <= r2) {
                System.out.println("Skacius yra reziuose");
                return true;
            } else {
                System.out.println("Skacius nera reziuose");
                return false;
            }
        }
    }

}
