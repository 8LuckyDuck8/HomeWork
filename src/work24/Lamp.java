package work24;

public class Lamp extends Appliances {
    protected boolean state = false;
    public void on(){
        if (state == false) {
            state = true;
            System.out.println("Лампа включена");
        } else {
            System.out.println("Лампа уже включена");
        }
    }
    public void off(){
        if (state == true) {
            state = false;
            System.out.println("Лампа выключена");
        } else {
            System.out.println("Лампа уже выключена");
        }
    }
}
