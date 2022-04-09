import java.util.Scanner;

public class print_all_even_numbers_till_n {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int num = 0;
        int n = Scanner.nextInt();
        // program to print all even numbers till n
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
