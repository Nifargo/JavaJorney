package compositions.compositionChallenge2;

public class SmartKitchen {
    private Fridge fridge;
    private Oven oven;
    private Microwave microwave;

    public SmartKitchen() {
        this.fridge = new Fridge();
        this.oven = new Oven();
        this.microwave = new Microwave();
    }

    public Fridge getFridge() {
        return fridge;
    }

    public Oven getOven() {
        return oven;
    }

    public Microwave getMicrowave() {
        return microwave;
    }
}
