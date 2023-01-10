package BJ13900;

import java.util.Scanner;

public class First {

    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        long[] arr = new long[N];       // 예로 1 3 5 7
        long[] sumarr = new long[N];    // ->  1 4 9 16
        long sum = 0;   // 합을 저장할 변수

        for(int i = 0; i<arr.length;i++) {
            arr[i] = sc.nextInt();  // 정수 배열 입력 받기
        }

        sumarr[0] = arr[0]; // 누적합 배열 0번째 인덱스는 숫자 배열의 0번째 인덱스와 같음

        for (int i = 1; i<N; i++) {
            sumarr[i] = sumarr[i-1] + arr[i];
        }

        for (int i = 0; i<N; i++) {
            sum = sum + arr[i] * (sumarr[N-1] - sumarr[i]);
        }

        System.out.print(sum);
    }
}
