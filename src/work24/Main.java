package work24;

public class Main {

    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        lamp.on();
        Fridge fridge = new Fridge();
        fridge.on();
        LavaLamp lavaLamp = new LavaLamp();
        lavaLamp.off();
    }

}
