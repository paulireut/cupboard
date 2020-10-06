public class Spoon extends Crockery {

    protected String there;
    protected int year;
    protected boolean original;

    public Spoon(String there, int year, boolean original) {

        this.there = there;
        this.year = year;
        this.original = original;

    }

    public void toAsk() {

        String toAsk = "What a beautiful spoon! Where did you get this? - It was " + there + " in " + year + " year";
        System.out.println(toAsk);
    }
}