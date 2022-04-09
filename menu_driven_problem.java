import java.util.Scanner;

public class menu_driven_problem {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int num = 0;
        int n = Scanner.nextInt();

        // menu driven problem loops
        do {
            System.out.println("Enter Marks out of 100");
            num = Scanner.nextInt();
            if (num >= 90) {
                System.out.println("Very Good");
            } else if (num <= 89 && num >= 60) {
                System.out.println("OK");

            } else if (num < 89) {
                System.out.println("AVERAGE");
            } else {
                System.out.println("INVALID");
            }
            System.out.println("do you want to continue?");
            n = Scanner.nextInt();
        } while (n == 1);
    }
}
