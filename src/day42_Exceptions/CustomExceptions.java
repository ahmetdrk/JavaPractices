package day42_Exceptions;

class FadyException extends RuntimeException {

    public FadyException() {
        super("Time for a short break");
    }

    public FadyException(String message) {
        super(message);
    }
}

class NoBreakException extends Exception {

}

public class CustomExceptions {

    public static void main(String[] args) {

        // throw new FadyException("It is time fo short break");r

        try {
            throw new NoBreakException();
        } catch (NoBreakException e) {
            e.printStackTrace();
        }

    }

}
