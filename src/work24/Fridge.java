package work24;

public class Fridge extends Appliances {
    protected boolean state = false;
    public void on(){
        if (state == false) {
            state = true;
            System.out.println("Холодильник включен");
        } else {
            System.out.println("Холодильник уже включен");
        }
    }
    public void off(){
        if (state == true) {
            state = false;
            System.out.println("Холодильник выключен");
        } else {
            System.out.println("Холодильник уже выключен");
        }
    }
}
