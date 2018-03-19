package Instruments;

import Accessories.InstrumentType;
import Behaviours.IPlay;
import Behaviours.ISell;


public abstract class Instrument implements IPlay, ISell{

    private String brand;
    private String model;
    private String category;
    private double buyPrice;
    private double sellPrice;
    private InstrumentType type;


    public Instrument(String brand, String model, String category, double buyPrice, double sellPrice, InstrumentType type) {
        this.brand = brand;
        this.model = model;
        this.category = category;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.type = type;

    }

         public String getBrand(){
        return this.brand;
        }

        public String getModel(){
        return this.model;
        }

        public String getCategory(){
        return this.category;
        }

        public double getBuyPrice(){
        return this.buyPrice;
        }

        public double getSellPrice(){
        return this.sellPrice;
        }

    @Override
    public double calculateMarkup() {
        return sellPrice - buyPrice;
    }

    @Override
    public String getSound() {
        return type.getSound();
    }

    }


