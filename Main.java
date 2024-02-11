import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int a = sc.nextInt();

        if (a % 4 == 0) {
            System.out.println(a + " Year is a leap Year.");
        } else {
            System.out.println(a + " Year is not a leap Year.");
        }

    }

}
