package model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.function.Predicate;

/**
 * @author wwg
 * @description 球员实体类
 * @date 11/27/2021 2:00 PM
 */
@Data
@AllArgsConstructor
public class Player {
    private Integer id;
    private Integer age;
    private String name;
    private String gender;

    public static Predicate<Player> ageGreaterThan40 = x -> x.getAge() > 40;
    public static Predicate<Player> genderM = x -> x.getGender().equals("M");

}
