package BJ4963;

import java.util.Scanner;

public class First {

    public static int w;    // 너비
    public static int h;    // 높이
    public static boolean[][] visited;  // 방문 여부 2차원 배열
    public static int[][] world;    // 섬과 바다 2차원 배열
    public static int[] cx = {0, 0, -1, 1, -1, -1, 1, 1};   // 8방향을 알아보는 좌표
    public static int[] cy = {-1,1, 0, 0, -1, 1, -1, 1};    // 8방향을 알아보는 좌표

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        while(true) {

            w = sc.nextInt();
            h = sc.nextInt();

            if (w == 0 && h == 0)   // 0,0 을 입력받으면 반복 종료
                break;

            world = new int[h][w];
            visited = new boolean[h][w];

            for (int i = 0; i<h; i++){  // 섬과 바다 입력받음
                for (int j = 0; j<w; j++) {
                    world[i][j] = sc.nextInt();
                }
            }

            int count = 0;  // 섬의 개수 카운트

            for (int i = 0; i<h; i++){
                for (int j=0; j<w; j++){
                    if (world[i][j] == 1 && !visited[i][j]){    // 섬이 있고 방문하지 않았다면
                        DFS(i,j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    static void DFS(int i, int j){

        visited[i][j] = true;   // 방문 표시

        for (int k = 0; k<8;k++){   // 8방향을 한 번씩 모두 탐색

            int x = i + cx[k];
            int y = j + cy[k];

            if (x>=0 && x<h && y>=0 && y<w){
                if(world[x][y] == 1 && !visited[x][y]){ // 재귀로 DFS 탐색
                    DFS(x,y);
                }
            }
        }
    }
}
