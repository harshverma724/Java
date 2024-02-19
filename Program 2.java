
import java.util.*;

public class Program 2 {

    public static void main(String[] args) {
        System.out.println("Write a Java program to find the index of an array element.");
        int a, b, x, y, z;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        a = sc.nextInt();
        System.out.println("Length of the array is: " + a);

        int[] array = new int[a];
        b = 1;
        for (int i = 0; i < a; i++) {

            System.out.print("Enter the " + b + " element: ");
            int c = sc.nextInt();
            array[i] = c;
            b++;
        }
        System.out.println("Array found: ");
        System.out.print("[");
        for (int i = 0; i < a; i++) {

            System.out.print(array[i]);
            if (i != (a - 1)) {
                System.out.print(",");
            }
        }
        System.out.println("]");
        System.out.println("Enter the value here: ");

        for (int i = 0; i < a; i++) {

            x = sc.nextInt();
            for (int j = 0; j < a; j++) {
                if (array[j] == x) {
                    System.out.println("Index found is: " + j);
                }

            }

        }

    }

}
