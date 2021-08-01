package Ex05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Quiz5_1 {

    /**
     * 숫자 리스트가 주어졌을 때 각 숫자의 제곱근으로 이루어진 리스트를 반환하시오.
     * 예를들어 [1, 2, 3, 4, 5]가 주어지면 [1, 4, 9, 16, 25]를 반환해야한다.
     */
    public static void main(String... args) throws Exception {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squre_list = list.stream()
                .map(i -> i * i)
                .collect(toList());

        System.out.println(squre_list);
    }
}
