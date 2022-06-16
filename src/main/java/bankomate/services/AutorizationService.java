package bankomate.services;

import bankomate.entity.Card;
import bankomate.exceptions.WrongPinException;
import sun.plugin.dom.exception.WrongDocumentException;

public interface AutorizationService {
    void LogIn (Card card, int pin) throws WrongPinException;
    void LogOut ();
}
