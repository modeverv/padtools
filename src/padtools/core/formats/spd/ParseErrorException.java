package padtools.core.formats.spd;

/**
 * パース時のエラー。
 */
public class ParseErrorException extends Exception {
    private final String userMessage;

    public ParseErrorException(String msg, String userMessage){
        super(msg);
        this.userMessage = userMessage;
    }

    public String getUserMessage(){
        return userMessage;
    }
}
