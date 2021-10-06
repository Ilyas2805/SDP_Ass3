package entities.concreteDecorators.sauces;

import entities.baseDecorator.AddDecoratorCombo;
import entities.component.IComponentCombo;

public class Tartar extends AddDecoratorCombo {
    public Tartar(IComponentCombo iComponentCombo){
        super(iComponentCombo);
    }

    private int costTartar(){
        return 100;
    }

    @Override
    public int cost() {
        return super.cost() + costTartar();
    }
}
