public interface YoutubeChannel {


    public void addSubscriber(Subscriber subscriber);
    public void removeSubscriber(Subscriber subscriber);
    void notifySubscribers();

}
