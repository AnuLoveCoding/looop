import java.util.Scanner;

public class problem3 {
    public static String freq_count(char [] arr){
        int [] count = new int[arr.length];
        String store = "";
        for (int i = 0; i < arr.length ; i++) {
            int freq = 0;
            char unique = arr[i];
            for (int j = 0; j < arr.length ; j++) {
                if(arr[j] == unique){
                    freq++;
                }
            }
            count[i] = freq;

            if(count[i]==1){
                store += unique;
            }
        }

        return store += "not found";
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        char [] arr = {'b','b','b','c','d','c','d',};

        System.out.println(freq_count(arr));

    }
}
