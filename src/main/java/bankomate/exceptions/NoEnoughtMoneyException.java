package bankomate.exceptions;

public class NoEnoughtMoneyException extends Exception {
    public  NoEnoughtMoneyException (){
        super("Недостаточно средств!!!");
    }
}
