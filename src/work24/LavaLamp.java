package work24;

public class LavaLamp extends Lamp {
    protected boolean state = false;
    public void on(){
        if(state == true) {
            System.out.println("Лава-лампа уже включена");
        }else {
            state = true;
            System.out.println("Лава-лампа включена");
        }
    }
    public void off(){
        if (state == false) {
            System.out.println("Лава-лампа уже выключена");
        } else {
            state = false;
            System.out.println("Лава-лампа выключена");
        }
    }
}
