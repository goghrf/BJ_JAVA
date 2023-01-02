import java.util.Scanner;

public class First {

    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // 행의 크기
        int M = sc.nextInt();   // 열의 크기

        int[][] array = new int[N][M];  // 2차원 배열 선언

        for (int i = 0; i< array.length; i++) {         // 행의 크기만큼 반복
            for (int j=0; j<array[i].length; j++) {     // 열의 크기만큼 반복
                array[i][j] = sc.nextInt();             // 2차원배열 요소 입력
            }
        }

        int K = sc.nextInt();   // 합을 구할 부분의 개수

        for (int i = 0; i < K; i++) {

            int sum = 0;

            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int j = b-1; j <= y-1; j++) {          // b-1부터 y-1까지 반복
                for (int t = a-1; t <= x-1; t++) {      // a-1부터 x-1까지 반복
                    sum += array[t][j];                 // 배열의 요소 합
                }
            }
            System.out.println(sum);
        }
    }
}