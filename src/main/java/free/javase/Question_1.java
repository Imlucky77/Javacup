package free.javase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question_1 {


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        //for_part(numbers);
        //while_part(numbers);
        System.out.println(recursive_part(numbers));
    }

    public static int for_part(List<Integer> numbers) {
        int answer = 0;
        for (int i = 0; i <= numbers.size(); i++) {
            answer += i;
        }
        System.out.println(answer);
        return answer;
    }

    public static int while_part(List<Integer> numbers) {
        int ans_while = 0;
        int size = numbers.size();
        int i = 0;
        while (i < size) {
            ans_while += numbers.get(i++);
        }
        System.out.println(ans_while);
        return ans_while;
    }

    public static int recursive_part(List<Integer> numbers) {
        int size = numbers.size();
        if (size > 0) {
            return numbers.get(0) + recursive_part(numbers.subList(1, size));
        }
        return 0;
    }
}
