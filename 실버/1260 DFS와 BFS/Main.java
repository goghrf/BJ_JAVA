import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // 정점의 개수
        int M = sc.nextInt();   // 간선의 개수
        int V = sc.nextInt();   // 시작 정점

        boolean[] visited = new boolean[N+1];   // 인덱스와 정점을 대응 시키기 위해서 +1

        int[][] arr = new int[N+1][N+1];    // 인접 행렬 2차원 배열 선언

        for (int i =0; i<M; i++) {  // 간선의 개수만큼 반복(무방향 그래프)
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            arr[v1][v2] = 1;    // 1이면 간선 존재, 0이면 없음
            arr[v2][v1] = 1;
        }

        getDFS(V, arr, visited);    // DFS 수행 결과
        Arrays.fill(visited, false);    // DFS 수행 이후 정점의 방문 여부 배열 초기화
        System.out.print("\n");
        getBFS(V, arr, visited);    // BFS 수행 결과
    }

    public static void getDFS(int v, int[][] arr, boolean[] visited) {  // BFS 수행 메소드(재귀)

        visited[v] = true;  // 해당 정점의 방문 확인
        System.out.print(v + " ");

        for (int i =1; i<= arr.length-1; i++) {     // 정점의 개수만큼 반복(행의 수만큼)

            if (arr[v][i] == 1 && !visited[i]) {    // v와 인접한 정점을 아직 방문하지 않았다면 재귀적으로 반복
                getDFS(i, arr, visited);
            }
        }
    }

    public static void getBFS(int v, int[][] arr, boolean[] visited) {  // BFS 수행 결과

        Queue<Integer> queue = new LinkedList<>();  // 큐 생성
        queue.add(v);   // 큐에 해당 정점 넣기
        visited[v] = true;  // 해당 정점의 방문 확인

        while(!queue.isEmpty()) {   // 큐가 빌 때까지 반복

            v = queue.remove(); // 큐에서 삭제
            System.out.print(v + " ");

            for(int i = 1; i<= arr.length-1; i++) { // 정점의 개수만큼 반복(행의 수만큼)
                if (arr[v][i] == 1 && !visited[i]) {    // v와 인접한 정점이 아직 방문되지 않았다면
                    queue.add(i);   // 큐에 정점 넣고
                    visited[i] = true;  // 방문 확인
                }
            }
        }
    }
}