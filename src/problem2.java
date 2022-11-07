import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Your number");
        int n = scn.nextInt();

        int count =0;

        for (; n>0 ; n/=10) {
             int rem = n%10;
            count++;

        }
        System.out.print(count);



    }
}
