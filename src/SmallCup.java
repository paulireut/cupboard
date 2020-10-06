public class SmallCup extends Cup {

    public SmallCup(String color, int volume, boolean hasHandle, String text) {

        super(color, volume, hasHandle, text);
    }

    public void fill() {

        String level = "I am just a small cup!";

        System.out.println(level);
    }
}
