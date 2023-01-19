package BJ1012;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class First {

    public static boolean[][] visited;  // 방문 여부 2차원 배열
    public static int[][] ground;   // 배추가 심어진 땅 2차원 배열
    public static int M;    // 가로의 길이
    public static int N;    // 세로의 길이

    public static int[] cx = {0,0,-1,1};    // 행(상, 하, 좌, 우)
    public static int[] cy = {-1,1,0,0};    // 열(상, 하, 좌, 우)

    public static void main(String argsp[]) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();   // 테스트 케이스

        for (int i = 0; i<T; i++) {

            M = sc.nextInt();   // 가로 길이
            N = sc.nextInt();   // 세로 길이
            int K = sc.nextInt();   // 배추 개수

            ground = new int[M][N];
            visited = new boolean[M][N];

            for (int j = 0; j<K; j++) {
                int v1 = sc.nextInt();
                int v2 = sc.nextInt();
                ground[v1][v2] = 1;     // 배추가 심어진 위치
            }

            int count = 0;  // 지렁이의 개수 카운트

            for (int j = 0; j<M; j++) {
                for (int k = 0; k<N; k++) {
                    if (ground[j][k] ==1 && !visited[j][k]) {
                        DFS(j,k);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    public static void DFS(int j, int k) {

        visited[j][k] = true;

        for (int i = 0; i<4; i++) {

            int x = j + cx[i];
            int y = k + cy[i];

            if (x>=0 && y>=0 && x<M && y<N){
                if (ground[x][y] == 1 & !visited[x][y]){
                    DFS(x,y);
                }
            }
        }
    }
}
