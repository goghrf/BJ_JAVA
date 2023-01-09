package BJ2644;

import java.util.Arrays;
import java.util.Scanner;

public class First {

    static Boolean[] visited;   // 방문 확인 배열
    static int[][] family;  // 그래프를 인접행렬로 표현할 2차원 배열
    static int total = -1;  // 촌수

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // 사람 수
        int start = sc.nextInt();   // 탐색 시작 번호
        int end = sc.nextInt();     // 탐색 끝 번호
        int m = sc.nextInt();   // 부모자식 관계 수

        visited = new Boolean[n+1]; // 사람 수 + 1 만큼 방문 배열 생성
        family = new int[n+1][n+1]; // 사람 수+1의 행과 열을 가진 인접 행렬

        Arrays.fill(visited, false);    // visited 배열의 모든 값을 false로 설정

        for (int i = 0; i<m; i++) { // 그래프를 인접행렬로 표현
            int x = sc.nextInt();
            int y = sc.nextInt();
            family[x][y] = 1;
            family[y][x] = 1;
        }

        DFS(start, end, 0);
        System.out.print(total);
    }

    public static void DFS(int start, int end, int count) {

        visited[start] = true;  // 시작점 방문

        for (int i = 1; i<= family.length-1; i++) {
            if (family[start][i] == 1 && !visited[i]) {
                if (i == end) { // 현재 점이 끝점이라면 +1 (total의 초기값이 -1이므로)
                    total = count+1;
                }
                DFS(i, end, count+1);
            }
        }
    }
}
