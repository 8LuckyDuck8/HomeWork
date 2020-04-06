package work25;

import java.util.HashMap;

public class MainCard extends Card {
    protected int money;
    private String cardId;
    private static HashMap<String , MainCard> cardsStore = new HashMap<String , MainCard>();

    public static Card getCard(String cardId){
        return cardsStore.get(cardId);
    }

    public MainCard(String cardId , HashMap cards) {
        this.cardId = cardId;
        cards.put(cardId, this);
    }


    public  void putMoney(int moneyAmount){
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
