import java.util.ArrayList;
import java.util.List;

public class YoutubeChannelImpl implements YoutubeChannel {

    public List<Subscriber> subscribers=new ArrayList<>();

    String video;

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(video);
        }
    }

    public void uploadVideo(String video) {
            this.video = video;
            notifySubscribers();
    }
}
