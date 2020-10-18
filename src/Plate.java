public class Plate extends Crockery {

    protected int diameter;
    protected String colour;
    protected boolean dishwasher_proof;
    protected String country;

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {

        this.diameter = diameter;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {

        this.colour = colour;
    }

    public boolean getDp() {

        return dishwasher_proof;
    }

    public void makeDishwasherproof() {

        this.dishwasher_proof = true;
    }

    public void makeNotDishwasherproof() {

        this.dishwasher_proof = false;
    }

    public String getCountry(int n) {

        return this.country.substring(0, n);
    }

    public void setCountry(String country) {

        this.country = country;
        if (country == "France") {
            this.dishwasher_proof = true;
        }
    }


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
