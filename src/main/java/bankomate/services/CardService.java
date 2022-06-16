package bankomate.services;

import bankomate.entity.Card;
import bankomate.exceptions.NoEnoughtMoneyException;
import bankomate.exceptions.WrongPinException;

public interface CardService {
    //поулучаем карту и сумму
    void CashIssue(int amount) throws NoEnoughtMoneyException;
    String ViewCashAmount (); //отражает недостаточно средств
    String pinChange (int oldPin, int newPin) throws WrongPinException;//меняет pin-код
    String addCash (int amount)//пополнение карточки
}
