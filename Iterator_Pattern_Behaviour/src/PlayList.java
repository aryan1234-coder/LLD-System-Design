import java.util.ArrayList;

public class PlayList {

    private ArrayList<String> songs;
    public PlayList() {
        songs = new ArrayList<>();

    }
    public void addSong(String song) {
        songs.add(song);
    }
    public Iterator iterator(String type) {

        switch (type) {
            case "simple":
                return new SimplePlayListIterator(this);
            case "shuffled":
                return new ShufflePlayListIterator(this);
            case "favourites":
                return new FavouriteListIterator(this);
            default:
                return null;

        }

    }

    public ArrayList<String> getAllSongs() {
        return songs;
    }
}
