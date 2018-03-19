package Instruments;

import Behaviours.IPlay;




public class Guitar extends Instrument implements IPlay {

    private int numberOfStrings;



    public Guitar(String brand, String model, String category, double buyPrice, double sellPrice, int numberOfStrings) {
        super(brand, model, category, buyPrice, sellPrice, IPlay);

        this.numberOfStrings = numberOfStrings;

    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }


    @Override
    public String sound() {
        return "Lets Rock";
    }
}
