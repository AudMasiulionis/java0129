package lesson5;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,4};
        System.out.println(averageArr(arr));
    }

    static double averageArr(int[] arr){
        return (double) sumArr(arr) /arr.length;
    }
    
    static int sumArr(int[] arr){
        int sum = 0;
        for (int num : arr) {
            sum+=num;
        }
        return sum;
    }


}
