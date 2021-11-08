package ProjectStem;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Exercise_4_3 {
    private static final int grade = 82;
    private static final String name = "Rumpelstiltskin";
    public static final int x = -3;

    public static void main(String[] args) {
        ArrayList<Boolean> bool = new ArrayList<Boolean>();
        /*1.   grade == 82
        2.   grade >= 82 and grade + 10 < 100
        3.   grade / 2 > 90 or grade == 75
        4.   not(name != "Rumpelstiltskin")
        5.   name == "Jim" or name == "Rumpelstiltskin"
        6.   x + 3 > 0 or x != -3 or x - 1 < -5
        7.   (x < 0 and x != 3) and x + 5 == 2
        8.   grade > 65 and (name == "Michael" or name == "Rumpelstiltskin") and not(x == -3)
        9.   x > 0 or (grade + 5 < 90 and grade >= 80) or name == "Pam"
        10.  (not(grade > x) and (name != "Dwight" and x <= 0)) or (grade > 0 and x % 2 == 1)*/
        bool.add(grade == 82);
        bool.add(grade >= 82 && grade + 10 < 100);
        bool.add(grade /2 > 90 || grade == 75);
        bool.add(!(name != "Rumpelstiltskin"));
        bool.add(name == "Jim" || name == "Rumpelstiltskin");
        bool.add(x + 3 > 0 || x != -3 || x -1 < -5);
        bool.add((x < 0 && x != 3) && x + 5 == 2);
        bool.add(grade > 65 && (name == "Michael" || name == "Rumpelstiltskin") || !(x== -3));
        bool.add(x > 0 || (grade + 5 < 90 && grade >=80) || name == "Pam");
        bool.add(!(grade > x && (name != "Dwight" && x <= 0)) || (grade > 0 && x % 2 == 1));
        IntStream.range(0, bool.size()).forEach(x -> {
            System.out.println(bool.get(x));
        });

    }
}
