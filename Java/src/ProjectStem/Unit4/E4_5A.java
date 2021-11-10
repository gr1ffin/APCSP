package ProjectStem.Unit4;

import java.util.ArrayList;
import java.util.Collections;

public class E4_5A {
    private static final ArrayList<String> names = new ArrayList<>();
    private static final ArrayList<Integer> values = new ArrayList<>();

    public static void main(String[] args) {
        addVariables();
        loopSix();
    }


    public static void addVariables() {
        names.add("Peter");
        names.add("Bruce");
        names.add("Steve");
        names.add("Tony");
        names.add("Natasha");
        names.add("Clint");
        names.add("Wanda");
        names.add("Hope");
        names.add("Danny");
        names.add("Carol");

        values.add(100);
        values.add(50);
        values.add(10);
        values.add(1);
        values.add(2);
        values.add(7);
        values.add(11);
        values.add(17);
        values.add(53);
        values.add(-8);
        values.add(-4);
        values.add(-9);
        values.add(-72);
        values.add(-64);
        values.add(-80);
    }

    public static void loopOne() {
        for (int z = 0; z < names.size(); ) {
            System.out.println(names.get(z));
            z += z + 2;
        }
    }

    public static void loopTwo() {
        for (Integer value : values) {
            if (value > 0) {
                System.out.println(value);
            }
        }
    }

    public static void loopThree() {
        double total = 0;
        for (Integer value : values) {
            total += value;
        }
        System.out.println(total);
    }

    public static void loopFour() {
        for (Integer value : values) {
            if (value % 2 != 0) {
                System.out.println(value + " is odd");
            }
        }
    }

    public static void loopFive() {
        Collections.sort(names);
        for (int x = 0; x < names.size(); x++) {
            if (names.get(x).startsWith("T")) {
                names.subList(x, names.size()).clear();
            }
        }
        System.out.println(names);
    }

    public static void loopSix() {
        Collections.sort(values);
        System.out.println(values);
        System.out.println(values.get(0));
        System.out.println(values.get(values.size() - 1));
    }
}
