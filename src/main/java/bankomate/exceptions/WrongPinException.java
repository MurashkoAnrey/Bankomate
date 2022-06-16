package bankomate.exceptions;

public class WrongPinException extends Exception {
    public  WrongPinException (int triesCount){
        super( "Не верный пинкод.Осталось попыток:" + triesCount );
    }
}
