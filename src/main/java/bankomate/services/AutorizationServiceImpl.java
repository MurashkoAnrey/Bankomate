package bankomate.services;

import bankomate.entity.Card;
import bankomate.exceptions.CardBlockException;
import bankomate.exceptions.WrongPinException;

public class AutorizationServiceImpl implements AutorizationService {
    private int triesCount =3;
    public void LogIn(Card card, int pin) throws WrongPinException {
        if (card.getPin()!=pin) {
            triesCount--;
            throw new WrongPinException(triesCount);
        }
    }

    public void LogOut() {
        if (triesCount){
            throw new CardBlockException();
        }

    }

}
