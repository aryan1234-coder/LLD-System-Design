package Decorator;

import BasePizza.BasePizzzas;

public class MushRoom extends  ToppingClass{
    BasePizzzas basePizzzas;

    public MushRoom(BasePizzzas basePizzzas) {
        this.basePizzzas = basePizzzas;
    }
    public int getCost(){
        return basePizzzas.getCost()+199;
    }
}
