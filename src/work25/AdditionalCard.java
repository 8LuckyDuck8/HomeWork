package work25;

import java.util.HashMap;

public class AdditionalCard extends MainCard{
    String mainCardId;

    public AdditionalCard(String cardId, HashMap cards, String mainCardId) {
        super(cardId, cards);
        if(cards.containsKey(mainCardId)){
            this.mainCardId = mainCardId;
        }else {
            throw new RuntimeException("Основная карта с ID: " + mainCardId + " не найдена.");
        }
    }

    public void putMoney(int moneyAmount){
        super.money += moneyAmount;
        System.out.println("Деньги положены на счет. Текущай баланс: " + super.money);
    }

    public int getMoney(int moneyAmount){
        if(super.money > moneyAmount){
            super.money -= moneyAmount;
            System.out.println("Операция завершена успешна. Остаток на счету: " + super.money);
            return moneyAmount;
        }else{
            System.out.println("Недостаточно денег на счету");
            return 0;
        }
    }
}
