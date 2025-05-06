public class EmailNotification implements Subscriber {
	
    String email;
    public EmailNotification(String email) {
        this.email = email;
    }
    public void update(String video) {
        System.out.println("Sending mail to " + email + " that Youtube Channel has uploaded the video" );

    }
}
