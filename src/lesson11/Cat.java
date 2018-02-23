package lesson11;

public class Cat {
    private String name;
    private static int count;
    public final int TAIL_COUNT = 1;

    public Cat(String name) {
        this.name = name;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void purr(){
        System.out.println("prr");
    }

    public static void staticPurr(){
        System.out.println("prr");
    }

    public static int staticPurr(int a, int b){
        return a + b;
    }
}
