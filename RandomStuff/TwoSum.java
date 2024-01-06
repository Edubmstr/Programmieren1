package RandomStuff;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9, 11};
        int target = 8;

        TwoSum object = new TwoSum();
        System.out.println(Arrays.toString(object.twoSum(numbers, target)));
    }


    public int[] twoSum(int [] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return numbers;
    }
}