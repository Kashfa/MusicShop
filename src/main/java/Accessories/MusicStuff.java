package Accessories;


import Behaviours.ISell;

public abstract class MusicStuff implements ISell {

        private String name;
        private double buyPrice;
        private double sellPrice;
        private double ISell;


        public MusicStuff(String name, double buyPrice, double sellPrice, double ISell) {
            this.name = name;
            this.buyPrice = buyPrice;
            this.sellPrice = sellPrice;
            this.ISell = ISell;

        }

        public String getName(){
            return this.name;
        }

        public double getBuyPrice() {
            return buyPrice;
        }

        public double getSellPrice() {
            return sellPrice;
        }



        public double calculateMarkUp() {
            return this.sellPrice - this.buyPrice;
        }

}



