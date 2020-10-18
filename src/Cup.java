public class Cup extends Crockery {

    protected String color;

    protected int volume;

    protected boolean hasHandle;

    protected String text;

    public String getColor() {

        return color;

    }

    public void setColor(String color) {

        this.color = color;
    }

    public int getVolume() {

        return volume;
    }

    public void setVolume(int volume) {

        this.volume = volume;
    }

    public boolean hasHandle() {

        return hasHandle;
    }

    public void setHasHandle(boolean hasHandle) {

        this.hasHandle = hasHandle;
    }

    public String getText() {

        return text;
    }

    public void setText(String text) {

        this.text = text;
    }


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
