package BinaryResearch.BJ1920;

import java.util.Arrays;
import java.util.Scanner;

public class First {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // N 입력

        int[] A = new int[N];   // 크기가 N인 배열 A 선언

        for (int i = 0; i<N; i++){  // A의 요소를 반복문으로 입력 받음
            A[i] = sc.nextInt();
        }

        int M = sc.nextInt();   // M 입력

        int[] arr = new int[M]; // 크기가 M인 배열 arr 선언

        for (int i = 0; i<M; i++){  // arr의 요소를 반복문으로 입력 받음
            arr[i] = sc.nextInt();
        }

        Arrays.sort(A); // 배열 A를 오름차순으로 정렬

        int target; // 찾고자 하는 수를 담을 변수 선언
        int[] result = new int[M];  // arr 요소의 각 결과를 담을 배열 result 선언
        Arrays.fill(result, 0); // result의 모든 요소를 0으로 채움

        for (int i = 0; i<M; i++) {

            target = arr[i];    // 타겟은 arr의 i번째 요소

            int start = 0;  // 탐색 범위의 시작
            int end = A.length-1;   // 배열 A의 길이 -1
            int mid = (start+end)/2;    // start와 end의 중간값

            while (end-start >= 0) {    //while 반복문
                if (A[mid] == target){  // 중간값과 타겟이 같을 때
                    result[i] = 1;
                    break;  // while 문 종료
                } else if (A[mid] > target){    // 중간값이 타겟보다 크면
                    end = mid - 1;  // 탐색 범위의 끝은 mid-1
                } else {    // 중간값이 타겟보다 작으면
                    start = mid + 1;    // 탐색 범위의 시작은 mid+1
                }
                mid = (end+start)/2;    // 중간값 갱신
            }
            System.out.print(result[i]);
            System.out.print("\n");
        }
    }
}
