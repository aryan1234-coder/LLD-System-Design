

public class FavouriteListIterator implements Iterator {

    private PlayList playList;
    private int index;
    public FavouriteListIterator(PlayList playList) {
        this.playList = playList;
        this.index = 0;
    }

    public boolean hasNext() {
        while(index< playList.getAllSongs().size()) {

            if(playList.getAllSongs().get(index).contains("Fav")) return true;
            index++;
        }
        return false;
    }
        public String next() {
        return playList.getAllSongs().get(index++);
        }


}
