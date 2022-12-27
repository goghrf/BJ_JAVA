import java.io.*;
import java.util.StringTokenizer;

public class First {
    public static void main(String[] args) throws IOException { // 입출력 예외 처리

        // 버퍼를 이용한 입출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // String 타입을 Int형으로 변환해서 변수 T에 저장
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 0 ; i < T; i++){
            // br 입력값을 " " 공백으로 자르기
            st = new StringTokenizer(br.readLine(), " ");
            // 더한 값을 출력
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }

        br.close(); // 입출력이 끝난 후 닫기
        bw.flush(); // 남아있는 데이터를 모두 출력
        bw.close(); // 입출력이 끝난 후 닫기

    }
}