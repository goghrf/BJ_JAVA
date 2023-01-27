package BJ1436;

import java.util.Scanner;

public class First {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // 찾고자 하는 영화 순서

        int count = 1;  // 영화 순서 카운트

        int title = 666;    // 검사를 진행할 숫자

        while(count != n){  // 카운트가 입력받은 숫자와 같기 전까지 반복

            title++;
            if (String.valueOf(title).contains("666")){ // 정수형 title을 문자열로 변환 후 666이 문자열에 있을 경우 카운트 +1
                count++;
            }
        }
        System.out.print(title);
    }
}
