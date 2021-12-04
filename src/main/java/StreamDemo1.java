import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author wwg
 * @description 流操作demo
 * @date 11/21/2021 5:53 PM
 */
public class StreamDemo1 {

    public static void main(String[] args) {

        // 集合的流操作
        List<String> players = Arrays.asList("kobe", "james", "curry", "cyyt");

        List<String> sorted = players.stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sorted);

        // 数组的流操作
        String[] players1 = {"kobe", "james", "curry", "cyyt"};
        // 多维数组的流操作
        Arrays.stream(players1)
                .flatMap(p -> Arrays.stream(p.split("")))
                .forEach(System.out::println);


        Stream<String> sorted1 = Stream.of(players1).filter(s -> s.startsWith("c")).map(String::toUpperCase);
        System.out.println(sorted1);

        Set<String> set = new HashSet<>(players);

        List<String> sorted2 = set.stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sorted2);

        // 文本文件转化为流
//        try {
//            Stream<String> stringStream = Files.lines(Paths.get("file.txt"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

}
