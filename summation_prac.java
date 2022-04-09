import java.util.Scanner;

public class summation_prac {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int num = 0;
        int n = Scanner.nextInt();

        // program to print sum of all numbers less than n
        for (int i = 0; i < n; i++) {
            num = num + i;
        }
        System.out.println(num);
    }
}
