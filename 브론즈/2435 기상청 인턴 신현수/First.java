import java.util.*;

public class First {

    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();       // 전체 날짜의 수

        int K = sc.nextInt();       // 연속적인 날짜의 수

        int[] arr = new int[N];     // 온도를 저장할 배열

        for (int i = 0; i<N; i++) { // 전체 날짜 수만큼 반복
            arr[i] = sc.nextInt();
        }

        int[] sumarr = new int[N-K+1];  // N-K+1 크기의 합배열 선언

        for (int i = 0; i<N-K+1; i++) {

            for (int j=i; j<i+K; j++) {

                sumarr[i] += arr[j];    // 합배열에 합 저장

            }

        }
        Arrays.sort(sumarr);        // 합배열 오름차순 정렬

        System.out.print(sumarr[N-K]);  // 합배열의 최댓값 출력
    }
}