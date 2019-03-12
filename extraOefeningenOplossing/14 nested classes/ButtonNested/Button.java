package ButtonNested;

public class Button {

    public String action;
    public boolean pushed;
    public String message;

    public Button(String action, boolean pushed) {
        this.action = action;
        this.pushed = pushed;
    }

    public Button(String action, boolean pushed, String message) {
        this.action = action;
        this.pushed = pushed;
        this.message = message;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = "Default action cannot change";
    }

    public boolean isPushed() {
        return pushed;
    }

    public void setPushed(boolean pushed) {
        this.pushed = pushed;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public String toString() {
        return "Button{" +
                "action='" + action + '\'' +
                ", pushed=" + pushed +
                ", message='" + message + '\'' +
                '}';
    }
}

