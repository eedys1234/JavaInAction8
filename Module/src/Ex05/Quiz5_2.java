package Ex05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Quiz5_2 {

    /**
     * 두 개의 숫자 리스트가 있을 때 모든 숫자 쌍의 리스트를 반환하시오.
     * 예를들어 두 개의 리스트 [1, 2, 3]과 [3, 4]가 주어지면 [(1,3), (1,4), (2,3), (2,4), (3,3), (3,4)]를 반환해야 한다.
     */
    public static void main(String... args) throws Exception {

        List<Integer> number1 = Arrays.asList(1, 2, 3);
        List<Integer> number2 = Arrays.asList(3, 4);

        List<int[]> pairs = number1.stream()
                .flatMap(i -> number2.stream().map(j -> new int[]{i, j}))
                .collect(toList());

        for(int[] pair : pairs)
        {
            System.out.println(pair[0] + ", " + pair[1]);
        }
    }
}
