import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int num = 0;
        int n = 0;

        // program to print the multiplication tables of number n
        for (int i = 1; i < 11; i++) {
            num = (n * i);
            System.out.println(num);
        }
    }
}