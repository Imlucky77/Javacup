package Linkedin;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class forTest {
    public static void main(String[] args) {
        int[] arr = {100, 200, 200, 300, 300, 300, 400, 400, 500, 300, 200,100, 200, 100, 100};
        //removeConsecutiveDuplicates(arr);
        //System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(removeConsecutiveDuplicates(arr)));
    }

    public static int[] removeConsecutiveDuplicates(int[] arr) {
        int n = arr.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (i < n - 1 && arr[i] == arr[i + 1]) {
                continue;  // skip over this element
            }
            arr[j] = arr[i];
            j++;
        }
        int[] result = Arrays.copyOf(arr, j);
        return result;
    }
}
