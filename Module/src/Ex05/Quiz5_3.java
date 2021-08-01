package Ex05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Quiz5_3 {

    /**
     * 이전 예제에서 순서쌍의 합이 3으로 나누어떨어지는 쌍만 반환하려면 어떻게 해야할까?
     * 예를들어 (2,4), (3,3)을 반환해야한다.
     */
    public static void main(String... args) throws Exception {

        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);

        List<int[]> pairs = numbers1.stream()
                .flatMap(i -> numbers2.stream()
                        .filter(j -> (i + j) % 3 == 0)
                        .map(j -> new int[]{i, j}))
                .collect(toList());

        for(int[] pair : pairs)
        {
            System.out.println(pair[0] + ", " + pair[1]);
        }
    }
}
