package Ex_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] z = new int[10];
        int c = 0;
        int x = 0;
        int n;

        while (x < z.length) {
            System.out.println("Enter number: ");
            n= input.nextInt();

            if ((n >= 10) && (n <= 100)) {
                boolean digit = false;
                x++;

                for (int j : z) {
                    if (j == n) {
                        digit = true;
                        break;
                    }
                }

                if (!digit) {

                    z[c] = n;

                    c++;

                }
            }else
                System.out.println("number must be between 10 and 100");


            for (int i =0;  i < x; i++) {
                if(z[i]!=0)
                    System.out.print(z[i] +" ");
            }

            System.out.println();
        }

    }
}
