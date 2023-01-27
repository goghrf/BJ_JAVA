package backtracking.BJ15649;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First {

    static int N,M; // N, M을 전역변수로 선언
    static int[] arr;   // M의 개수만큼 출력할 때 쓸 배열
    static boolean[] visited;   // 숫자 방문 여부
    static StringBuilder sb = new StringBuilder();

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M+1]; // 인덱스의 번호와 숫자를 일치시키기 위해 크기를 +1로 선언
        visited = new boolean[N+1];

        DFS(0); // DFS
        System.out.print(sb);

    }

    public static void DFS(int k){  // DFS로 탐색 시작

        if (k == M){    // 배열에 있는 숫자가 M과 같아질 때
            for (int i = 1; i<= M; i++){
                sb.append(arr[i]).append(" ");  // 배열의 요소 출력
            }
            sb.append("\n");
            return; // 재귀를 종료시키는 return 문
        }

        for (int i = 1; i <= N; i++){
            if(!visited[i]){    // 방문하지 않았을 시 실행
                visited[i] = true;
                arr[k+1] = i;
                DFS(k+1);   // DFS 재귀
                visited[i] = false;
            }
        }
    }
}