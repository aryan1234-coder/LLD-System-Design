public class SimplePlayListIterator implements  Iterator {

    private  PlayList playList;
    private int index;
    public SimplePlayListIterator(PlayList playList) {
        this.playList = playList;
        this.index = 0;
    }

    public boolean hasNext() {
        return index < playList.getAllSongs().size();
    }
    public String next() {
           return playList.getAllSongs().get(index++);

    }



}
