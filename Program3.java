//Get the bytes used by the 2D array.
import java.util.*;

public class Program3 {

    public static void main(String args[]) {
        int element;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows here: ");
        int r = sc.nextInt();
        System.out.print("Enter the no. of columns here: ");
        int c = sc.nextInt();


        //Forming the array
        int[][] array = new int[r][c];


        //getting the size of the array in bytes(due to int datatype)
        System.out.println("Memory Utilised by this 2D array is: " + ((r * c) * 4) + " bytes.");


        //assigning the values to the array
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter the " + i + "," + j + " element: ");
                element = sc.nextInt();
                array[i][j] = element;
                System.out.println(" ");

            }
        }


        // printing the array elements.
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(array[i][j]);
                System.out.print(" | ");
            }
            System.out.println(" ");

            }


        }
    }
