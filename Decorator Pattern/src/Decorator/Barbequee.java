package Decorator;

import BasePizza.BasePizzzas;

public class Barbequee extends ToppingClass {

    BasePizzzas basePizzzas;

    public Barbequee(BasePizzzas basePizzzas) {
        this.basePizzzas = basePizzzas;
    }
    public int getCost(){
        return basePizzzas.getCost()+159;
    }
}
