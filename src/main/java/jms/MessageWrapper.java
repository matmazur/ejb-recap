package jms;

public class MessageWrapper {


    private String message;
    private String toWhom;


    public MessageWrapper(String message, String toWhom) {
        this.message = message;
        this.toWhom = toWhom;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getToWhom() {
        return toWhom;
    }

    public void setToWhom(String toWhom) {
        this.toWhom = toWhom;
    }
}
