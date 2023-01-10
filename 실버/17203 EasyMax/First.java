package BJ17203;

import java.util.Scanner;

public class First {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();

        long[] arr = new long[N];

        for (int i =0; i<N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i=0; i<Q; i++) {

            int first = sc.nextInt();
            int last = sc.nextInt();
            long differ = 0;

            for (int j = first; j<last ; j++) {
                differ += Math.abs(arr[j] - arr[j-1]);
            }

            System.out.println(differ);
        }
    }
}
