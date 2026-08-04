package Pattern;

import java.util.Scanner;

public class RightAngleStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows::");
        int rows = sc.nextInt();

        System.out.println("Enter the number of colums::");
        int colums = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int col = 1; col <= i; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}

