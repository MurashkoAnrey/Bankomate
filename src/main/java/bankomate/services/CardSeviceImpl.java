package bankomate.services;

import bankomate.entity.Card;
import bankomate.exceptions.NoEnoughtMoneyException;
import bankomate.exceptions.WrongPinException;

public class CardSeviceImpl implements CardService {
    private Card card;
    private AutorizationService autorizationService;

    public CardSeviceImpl(Card card, AutorizationService autorizationService) {
        this.card = card;
        this.autorizationService = autorizationService;
    }

    public void CashIssue(int amount) throws NoEnoughtMoneyException {
        if (card.setCashAmount()>amount){
            throw new NoEnoughtMoneyException();
        }
        card.setCashAmount(card.getCashAmount()-amount);
    }

    public String ViewCashAmount() {
        return String.valueOf(card.getCashAmount());
    }

    public String pinChange(int oldPin, int newPin) throws WrongPinException {
        autorizationService.LogIn(card,oldPin);
        card.setPin(newPin);
        return "Пин изменен!!";
    }

    public String addCash(int amount) {
        return null;
    }
}
