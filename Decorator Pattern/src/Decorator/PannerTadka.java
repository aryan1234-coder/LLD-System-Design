package Decorator;

import BasePizza.BasePizzzas;

public class PannerTadka extends ToppingClass {
    BasePizzzas basePizzzas;

    public PannerTadka(BasePizzzas basePizzzas) {
        this.basePizzzas = basePizzzas;
    }
    public int getCost(){
        return basePizzzas.getCost()+339;
    }
}
