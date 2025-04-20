public class PushNotification implements Subscriber {

    String userDevice;
    public PushNotification(String userDevice) {
        this.userDevice = userDevice;
    }

    public void update(String video) {
        System.out.println("YoutubeSubscriber Sending push notification in user device " + userDevice + " is watching the video" + video );
    }



}
