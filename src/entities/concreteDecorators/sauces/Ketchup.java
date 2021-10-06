package entities.concreteDecorators.sauces;

import entities.baseDecorator.AddDecoratorCombo;
import entities.component.IComponentCombo;

public class Ketchup extends AddDecoratorCombo {
    public Ketchup(IComponentCombo iComponentCombo){
        super(iComponentCombo);
    }

    private int costKetchup(){
        return 100;
    }

    @Override
    public int cost() {
        return super.cost() + costKetchup();
    }
}
