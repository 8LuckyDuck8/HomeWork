package work25;

import java.util.HashMap;

public class CreditCard extends MainCard {
    private int money;
    private int minusLimit;

    public CreditCard(String cardId, HashMap cards, int minusLimit) {
        super(cardId, cards);
        this.minusLimit = minusLimit;
    }

    public void putMoney(int moneyAmount) {
        this.money += moneyAmount;
        System.out.println("Деньги положены на счет. Текущай баланс: " + this.money);
    }

    public int getMoney(int moneyAmount) {
        if(moneyAmount - this.money < minusLimit ){
            this.money -= moneyAmount;
            System.out.println("Операция завершена успешна. Текущие состояние счета: " + this.money);
            return moneyAmount;
        } else {
            System.out.println("Превышен лимит по счету. Операция отменена");
            return 0;
        }

    }
}
