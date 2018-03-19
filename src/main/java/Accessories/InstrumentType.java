package Accessories;

public enum InstrumentType {

    GUITAR("Lets Rock");


    private String sound;

    InstrumentType(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
}