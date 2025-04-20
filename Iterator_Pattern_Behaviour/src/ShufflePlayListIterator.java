import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShufflePlayListIterator implements Iterator{


    private PlayList playList;
    private int index;
    private List<String> shuffleSongs;
    public ShufflePlayListIterator(PlayList playList) {

        this.playList = playList;
        shuffleSongs = new ArrayList<>(playList.getAllSongs());
        Collections.shuffle(shuffleSongs);
        index = 0;
    }

    public boolean hasNext() {
        return index < shuffleSongs.size();
    }

    public String next() {
          return   shuffleSongs.get(index++);
    }

}
