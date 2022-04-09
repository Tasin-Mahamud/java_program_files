import java.util.Scanner;

import javax.sql.rowset.CachedRowSet;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Num 1 \t");
        int num1 = scanner.nextInt();
        System.out.println("Enter Num 2 \t");
        int num2 = scanner.nextInt();
        System.out.println("Enter Operator \n1 for + \n2 for -\n3 for *\n4 for /");
        int opt = scanner.nextInt();

        // by using conditonal operation

        // if (opt == 1)
        // System.out.println(num1 + num2);
        // else if (opt == 2)
        // System.out.println(num1 - num2);
        // else if (opt == 3)
        // System.out.println(num1 * num2);
        // else if (opt == 4)
        // System.out.println(num1 / num2);
        // else
        // System.out.println("ERROR");

        // by using switch cases
        switch (opt) {
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;
            case 4:
                System.out.println(num1 / num2);
                break;

            default:
                System.out.println("Invalid button3");
                break;
        }

    }
}