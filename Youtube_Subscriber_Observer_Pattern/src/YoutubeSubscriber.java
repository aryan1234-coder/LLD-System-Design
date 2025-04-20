public class YoutubeSubscriber implements Subscriber{

    String name;
    public YoutubeSubscriber(String name) {
        this.name = name;
    }

    public void update(String video) {
        System.out.println("YoutubeSubscriber " + name + " is watching the video" + video );
    }

}
