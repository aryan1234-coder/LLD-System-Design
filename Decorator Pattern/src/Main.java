import BasePizza.BasePizzzas;
import BasePizza.Marghertta;
import Decorator.*;

public class Main {
        public static void main(String[] args) {

            BasePizzzas basePizzzas = new Barbequee(new Marghertta());
            int ans=basePizzzas.getCost();
            System.out.println(ans);

            BasePizzzas basePizzzas2 = new ExtraCheese(new PannerTadka(new Chicken( new MushRoom(new Barbequee(new Marghertta())))));

     int ans2=basePizzzas2.getCost();
     System.out.println(ans2);
        }
    }


