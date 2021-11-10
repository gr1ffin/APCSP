package ProjectStem.Unit4;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class E4_3A {
    private static final int grade = 82;
    private static final String name = "Rumpelstiltskin";
    public static final int x = -3;

    public static void main(String[] args) {
        ArrayList<Boolean> bool = new ArrayList<Boolean>();
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
