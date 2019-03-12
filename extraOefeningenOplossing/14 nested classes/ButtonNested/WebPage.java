package ButtonNested;

public class WebPage {
	private Button button1;
    private Button button2;
    private Button button3;
    private org.rastalion.chapter14_geneste_en_anonieme_klassen.demo1.Button button4;

    public WebPage () {
        setupWebsite();
    }

    public void clickButton(Button b) {
        b.click(b);
    }

    private void setupWebsite () {
        button1 = new Button("pops a dialog",
                false,"Thank you for clicking!");
        button2 = new Button("opens help menu",
                false,"Need some help mema?");
        button3 = new Button("minimalize screen",
                false, "nobody puts baby in the corner.");
        button4 = new org.rastalion.chapter14_geneste_en_anonieme_klassen.demo1.Button("exit application",
                false,"I'll be back");
    }

    @Override
    public String toString () {
        return "WebPage " +
                "button1: " + button1 +
                ", button2: " + button2 +
                ", button3: " + button3 +
                ", button4: " + button4;
    }

    class Button extends org.rastalion.chapter14_geneste_en_anonieme_klassen.demo1.Button {

        public Button (String action, boolean pushed, String message) {
            super(action, pushed, message);
        }

        public void click(Button b) {
            b.pushed = true;
            System.out.println(b.getAction());
            System.out.println(b.getMessage());
            b.pushed = false;
        }

        @Override
        public void setAction (String action) {
            this.action = action;
        }


        @Override
        public String toString () {
            return "Webpage Button{" +
                    "action='" + action + '\'' +
                    ", pushed=" + pushed +
                    ", message='" + message + '\'' +
                    '}';
        }

        //Einde subklasse
    }

    public static void main (String[] args) {

        WebPage app = new WebPage();
        app.button1.setAction("New action");
        app.button2.setAction("New action");
        app.button3.setAction("New action");
        app.button4.setAction("New action");

        app.clickButton(app.button1);
        app.clickButton(app.button2);
        app.clickButton(app.button3);

        System.out.println(app);
    }
}
