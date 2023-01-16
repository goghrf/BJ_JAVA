package BJ2606;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class First {

    public static boolean visited[];    // 방문 여부를 확인하는 배열
    public static int[][] networks;     // 컴퓨터 연결 여부 2차원 배열
    public static int count;    // 바이러스에 걸린 컴퓨터 카운트

    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // 컴퓨터의 수(정점의 개수)
        int m = sc.nextInt();   // 연결된 네트워크 수(간선의 개수)

        visited = new boolean[n+1]; // 인덱스의 번호와 정점의 번호가 같게끔 n+1 크기로 선언
        networks = new int[n+1][n+1];

        for(int i =0; i<m;i++) {    // 인접행렬로 그래프 표현
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            networks[v1][v2] = 1;
            networks[v2][v1] = 1;
        }

        bfs(1); // 1로 시작
    }

    public static void bfs(int v) {

        Queue<Integer> queue = new LinkedList<>();  // 큐 생성
        visited[v] = true;  // 정점 1 방문

        queue.offer(v); // 큐에 정점 1 넣기

        while(!queue.isEmpty()){    // 큐가 비지 않을 때까지 반복
            int x = queue.poll();   // 제일 밑에 있는 큐 꺼내기
            for (int i = 1; i<= visited.length-1; i++) {
                if(networks[x][i]==1 && !visited[i]){   // 정점이 인접해있고 그 정점이 아직 방문하지 않았다면
                    visited[i] = true;
                    queue.add(i);   // 큐에 그 정점 넣기
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}