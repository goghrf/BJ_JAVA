import java.util.*;

public class First {

    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();           // 테스트 케이스 수

        for(int k=0; k<T; k++) {        // 테스트 케이스 수만큼 반복

            int N = sc.nextInt();       // 케이스 당 배열의 크기

            int[] arr = new int[N];     // 배열 선언

            for (int i = 0; i<N;i++) {  // 배열 요소 입력
                arr[i] = sc.nextInt();
            }

            for (int i = 1; i<N; i++) {

                if (arr[i] >= (arr[i] + arr[i-1])) {    // 현재 값이 이전 값과 현재 값을 더한 값보다 크면
                    arr[i] = arr[i];                    // 현재 값 저장
                } else {                                // 작으면
                    arr[i] = arr[i] + arr[i-1];         // 이전 값과 현재 값을 더한 값 저장
                }

            }

            Arrays.sort(arr);           // 배열 오름차순 정렬

            System.out.println(arr[N-1]);   // 최대값 출력

        }
    }
}