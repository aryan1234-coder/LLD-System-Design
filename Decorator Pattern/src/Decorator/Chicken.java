package Decorator;

import BasePizza.BasePizzzas;

public class Chicken extends ToppingClass{

    BasePizzzas basePizzzas;

    public Chicken(BasePizzzas basePizzzas) {
        this.basePizzzas = basePizzzas;
    }
    public int getCost(){
        return basePizzzas.getCost()+340;
    }
}
