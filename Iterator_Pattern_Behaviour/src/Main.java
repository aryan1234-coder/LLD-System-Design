//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PlayList pl = new PlayList();
        pl.addSong("Despacito");
        pl.addSong("love me like a do Fav");
        pl.addSong("tumhi dekho na ye kya ho gya Fav");
        pl.addSong("tum se hi din hota hai");
        pl.addSong("tune jo na kaha main vo sunta rha");

        System.out.println("Simple PlayList Option");
        Iterator simpleIterator=pl.iterator("simple");
        while(simpleIterator.hasNext()) {
            System.out.println("Playing Songs - " + simpleIterator.next());
        }

        System.out.println("Shuffle PlayList Option");
        Iterator shuffleIterator=pl.iterator("shuffled");
        while(shuffleIterator.hasNext()) {
            System.out.println("Playing Songs - " + shuffleIterator.next());
        }

        System.out.println("Favourite PlayList Option");
        Iterator favouriteIterator=pl.iterator("favourites");
        while(favouriteIterator.hasNext()) {
            System.out.println("Playing Songs - " + favouriteIterator.next());
        }



    }
}