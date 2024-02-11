import java.util.*;

public class Program_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");

        int c, n, x;
        n = sc.nextInt();
        x = 1;
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Enter the " + (x) + " element: ");
            x++;
            c = sc.nextInt();
            array[i] = c;

        }
        System.out.println("Array Length: " + array.length);
        System.out.print("Elements of the array are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println("\nElements of the array are: ");
        for (int num : array) {

            System.out.print(num + " ");
        }

    }

}
