package work25;

import java.util.HashMap;

public class DebitCard extends MainCard {
    private int money;

    public DebitCard(String cardId, HashMap cards) {
        super(cardId, cards);
    }

    public void putMoney(int moneyAmount){
        this.money += moneyAmount;
        System.out.println("Деньги положены на счет. Текущай баланс: " + this.money);
    }
    public int getMoney(int moneyAmount){
        if(this.money > moneyAmount){
            this.money -= moneyAmount;
            System.out.println("Операция завершена успешна. Остаток на счету: " + this.money);
            return moneyAmount;
        }else{
            System.out.println("Недостаточно денег на счету");
            return 0;
        }
    }

}
