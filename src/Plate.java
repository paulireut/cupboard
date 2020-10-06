public class Plate extends Crockery {

    protected int diameter;
    protected String colour;
    protected boolean dishwasher_proof;
    protected String country;


    public Plate(int diameter, String colour, boolean dishwasher_proof, String country) {

        this.diameter = diameter;
        this.colour = colour;
        this.dishwasher_proof = dishwasher_proof;
        this.country = country;

    }


    public void toWash() {

        String toWash = "Dishwasher has finished the cycle.";
        System.out.println(toWash);
    }



}
