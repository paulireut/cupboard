public class CeramicPlate extends Plate {

    public CeramicPlate (int diameter, String color, boolean dishwasher_proof, String country) {

        super(diameter, color, dishwasher_proof, country);
    }
        public void toWash() {

        String toWash = "Washed by hand.";
        System.out.println(toWash);
        }
}
