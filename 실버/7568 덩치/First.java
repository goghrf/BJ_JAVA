package BJ7568;

import java.util.Scanner;

class People {

    int weight;     // 사람의 몸무게
    int height;     // 사람의 키
    int result = 1; // 사람의 등수

    People(int weight, int height){ // 매개변수가 있는 생성자
        this.weight = weight;
        this.height = height;
    }

}

public class First {


    public static void main(String args[]) {

        Scanner sc = new Scanner((System.in));

        int n = sc.nextInt();   // 전체 사람 수

        People[] list = new People[n];    // People 타입의 객체를 담는 배열 생성

        for (int i = 0; i<n; i++) {     // 배열에 객체 넣기
            int w = sc.nextInt();
            int h = sc.nextInt();
            list[i] = new People(w,h);
        }

        for (int i =0; i<n-1; i++){         // 연이어 있는 사람 둘을 비교
            for (int j = i+1; j<n; j++) {
                if (list[i].weight < list[j].weight){   // 뒷 사람의 몸무게가 더 크고
                    if (list[i].height < list[j].height){   // 키가 더 클 때
                        list[i].result++;   // 앞 사람의 등수 +1
                    }
                } else if (list[i].weight > list[j].weight) {   // 앞 사람의 몸무게가 더 크고
                    if (list[i].height > list[j].height) {      // 키가 더 클 때
                        list[j].result++;   // 뒷 사람의 등수 +1
                    }
                }
            }
        }
        for (int i = 0; i<n; i++){
            System.out.print(list[i].result + " ");
        }
    }
}
