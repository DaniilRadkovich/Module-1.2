package module_1_2;

import java.util.Arrays;

public class Module_1_2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findTwo(new int[]{12, 3, 8, 15, 17, 20, 4, 12}, 24)));
        System.out.println(findDuplicates(new int[]{12, 3, 8, 15, 17, 20, 4}));
    }


    public static int[] findTwo(int[] array, int toSearch) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == toSearch) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }

    public static boolean findDuplicates(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j])
                    return true;
            }
        }
        return false;
    }
}

