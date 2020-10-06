public class Cup extends Crockery {

    protected String color;

    protected int volume;

    protected boolean hasHandle;

    protected String text;


    public Cup(String color, int volume, boolean hasHandle, String text) {

        this.color = color;
        this.volume = volume;
        this.hasHandle = hasHandle;
        this.text = text; }


    public String toString() {

        String toString = "Print: " + this.color
                + "; Has handle: " + hasHandle;

        return(toString);

    }


    public void fill() {

        String level = "I am filled to " + volume + " ml";
        System.out.println(level);
    }
}
