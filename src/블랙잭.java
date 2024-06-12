import java.util.Arrays;
import java.util.Scanner;

public class 블랙잭 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력받기
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] cards = new int[n];
        for (int i = 0; i < n; i++) {
            cards[i] = scanner.nextInt();
        }

        // 결과 저장 변수
        int result = 0;

        // 3장 선택해서 합 구하기
        //0번째 카드

            for (int i = 0; i < n - 2; i++) {      // 첫 번째 카드
            for (int j = i + 1; j < n - 1; j++) {  // 두 번째 카드
                for (int k = j + 1; k < n; k++) {  // 세 번째 카드
                    int sum = cards[i] + cards[j] + cards[k];
                    if (sum <= m && sum > result) {
                        result = sum;
                    }
                }
            }
        }

        // 결과 출력
        System.out.println(result);
    }

}
