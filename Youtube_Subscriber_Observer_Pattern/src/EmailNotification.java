public class EmailNotification implements Subscriber {


    String email;
    public EmailNotification(String email) {
        this.email = email;
    }
    public void update(String video) {
        System.out.println("YoutubeSubscriber Sending mail to " + email + " is watching the video" + video );

    }
}
