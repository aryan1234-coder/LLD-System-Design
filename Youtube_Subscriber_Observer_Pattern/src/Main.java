//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        YoutubeChannelImpl channel = new YoutubeChannelImpl();
        YoutubeSubscriber AryanSachan = new YoutubeSubscriber("AryanSachan");
        YoutubeSubscriber YashPandey = new YoutubeSubscriber("Yash Pandey");

        EmailNotification email=new EmailNotification("aryansachan2017@gmail.com");


        channel.addSubscriber(YashPandey);
        channel.addSubscriber(AryanSachan);

        channel.uploadVideo("Java Tutorial");
        email.update("Java Tutorial");
       // channel.removeSubscriber(YashPandey);


    }
}