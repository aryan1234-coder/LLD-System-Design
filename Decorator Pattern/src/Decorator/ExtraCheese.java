package Decorator;

import BasePizza.BasePizzzas;

public class ExtraCheese extends ToppingClass {
    BasePizzzas basePizzzas;

    public ExtraCheese(BasePizzzas basePizzzas) {
        this.basePizzzas = basePizzzas;
    }
    public int getCost(){
        return basePizzzas.getCost()+59;
    }
}
