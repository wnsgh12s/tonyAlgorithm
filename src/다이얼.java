import java.util.Scanner;

public class 다이얼 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.next();

        //ABC, DEF , GHI... 등등 알파뱃 순서로 맵핑
        int[] nums = {2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9};

        int result = 0;
        for (char c : input1.toUpperCase().toCharArray()) {
            result += nums[c - 'A'] + 1;
        }

        System.out.println(nums[22]);
        System.out.println(result);
    }
}
