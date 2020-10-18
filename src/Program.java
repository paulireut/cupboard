public class Program {

    public static void main(String[] args) {

        Plate luminarc = new Plate(22, "Blue", true, "France");
        Plate ikeahome = new Plate (16, "grey", false, "Poland");
        Spoon stolenspoon = new Spoon("stolen", 1892, true);
        Spoon crocks = new Spoon("presented", 1980, false);
        Plate artemium = new CeramicPlate(25, "green", false, "Russia");
        Plate horse = new Plate(16, "brown", true, "Wales");
        Plate goose = new CeramicPlate(10, "white with a goose's tongue", false, "the Netherlands");
        Plate lord = new Plate(30, "yellow", true, "Iceland");
        Cup smallCup = new SmallCup ("White", 10, true, null);
        Cup anotherCup = new SmallCup ("transparent", 15, false, "China");


        Crockery[] crockery = new Crockery[10];
        crockery [0] = luminarc;
        crockery [1] = ikeahome;
        crockery [2] = stolenspoon;
        crockery [3] = crocks;
        crockery [4] = artemium;
        crockery [5] = horse;
        crockery [6] = goose;
        crockery [7] = lord;
        crockery [8] = smallCup;
        crockery [9] = anotherCup;


            System.out.println(goose);
        

            smallCup.toString();
            stolenspoon.toAsk();
            luminarc.toWash();
            goose.toWash();
            artemium.toWash();
            crocks.toAsk();


            System.out.println(luminarc.getCountry(3));

            System.out.println(ikeahome.getDp());


            ikeahome.setCountry("France");

        System.out.println(ikeahome.getDp());






    }



    }

    






























































