import java.util.Arrays;
import java.util.Scanner;

public class 동전0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }

        int count = 0;
        System.out.println("초기 금액: " + k);

        // 큰 가치의 동전부터 사용하기 위해 역순으로 탐색
        for (int i = coins.length - 1; i >= 0; i--) {
            if (coins[i] <= k) {
                int numCoins = k / coins[i];  // 현재 동전으로 사용할 수 있는 개수
                count += numCoins;  // 현재 동전의 개수를 더함
                k %= coins[i];  // 남은 금액을 갱신

                System.out.println(coins[i] + "원 동전 " + numCoins + "개 사용");
                System.out.println("남은 금액: " + k);
            }
        }

        System.out.println("총 사용된 동전 개수: " + count);
    }
}
