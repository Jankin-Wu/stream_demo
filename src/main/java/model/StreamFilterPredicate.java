package model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wwg
 * @description stream 断言
 * @date 11/27/2021 2:10 PM
 */
public class StreamFilterPredicate {

    public static void main(String[] args) {
        Player p1 = new Player(1, 67, "aa", "M");
        Player p2 = new Player(2, 45, "kobe", "F");
        Player p3 = new Player(3, 23, "james", "M");
        Player p4 = new Player(4, 18, "curry", "F");
        Player p5 = new Player(5, 38, "cyyt", "M");
        List<Player> playerList = Arrays.asList(p1, p2, p3, p4, p5);

        List<Player> players = playerList.stream()
                .filter(player -> player.getAge() > 40 && player.getGender().equals("M"))
                .collect(Collectors.toList());

        System.out.println(players);

        List<Player> players1 = playerList.stream()
                .filter(Player.ageGreaterThan40.and(Player.genderM))
                .collect(Collectors.toList());
        System.out.println(players1);
    }

}
