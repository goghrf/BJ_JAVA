package BJ11724;

import java.util.Arrays;
import java.util.Scanner;

public class First {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // 정점의 개수
        int m = sc.nextInt();   // 간선의 개수
        Boolean[] visited = new Boolean[n+1];   // 정점 방문 배열
        int[][] graph = new int[n+1][n+1];      // 인접 행렬로 나타낸 그래프

        Arrays.fill(visited, false);    // 방문 배열의 모든 값을 false로 초기화

        int count = 0;  // 연결 요소 개수

        for (int i = 0; i<m; i++) { // 인접 행렬로 그래프 구현
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u][v] = 1;
            graph[v][u] = 1;
        }

        for (int i = 1; i<= n; i++) {   // 연결 요소 개수 세기
            if (!visited[i]) {  // 방문하지 않은 정점에서 DFS
                DFS(i, graph, visited);
                count++;    // 연결 요소 +1
            }
        }

        System.out.print(count);

    }

    public static void DFS(int v, int[][] graph, Boolean[] visited){    // DFS 구현

        visited[v] = true;  // 초기값 방문 확인

        for (int i = 1; i<=graph.length-1; i++) {

            if (graph[v][i] == 1 && !visited[i]) {  // 인접해 있고 방문하지 않았다면 DFS 재귀
                DFS(i, graph, visited);
            }
        }
    }
}
