import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int n = scn.nextInt();
//        print all natural 1 to n and jump with 2 numbers;
//        for (int i = 1; i <=n ; i+=2) {
//            System.out.print(i+" ");
//        }

//        Q.2 find palindrome number;
//        for (int i = 1; i <=n ; i++) {
//            int temp = n;
//            int sum =0;
//            for (int j = 0; n>j ; n/=10) {
//                int rem = n%10;
//                sum = (sum*10) +rem;
//            }
//
//            if(temp == sum )System.out.println("It is palindrome number " + sum);
//        else System.out.println("It is not palindrome number "+sum);

//        }

//        Q.3 find the prime number;
            int count =0;
            for (int i = 1; i <=n ; i++) {
                if(n%i==0){
                    count++;
                }
                if(count>2){
                    break;
                }
            }
            if(count==2)System.out.println("It is prime number");
            else System.out.println("It is not prime number");



    }
}
