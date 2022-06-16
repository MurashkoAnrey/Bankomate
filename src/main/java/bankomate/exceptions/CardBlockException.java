package bankomate.exceptions;

public class CardBlockException extends RuntimeException {
    public CardBlockException() {
        super("Попыток не осталось.В банк дуй");
    }
}
