package Recursion;

public class Count {
    public static void main(String[] args) {
        System.out.println(countZero(0));
    }


    public static int countZero(int num) {
        if (num == 0) {
            return 0;
        }
        if (num % 10 == 0) {
            return 1 + countZero(num / 10);
        }
        return countZero(num / 10);
    }
}
