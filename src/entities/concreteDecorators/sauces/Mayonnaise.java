package entities.concreteDecorators.sauces;

import entities.baseDecorator.AddDecoratorCombo;
import entities.component.IComponentCombo;

public class Mayonnaise extends AddDecoratorCombo {
    public Mayonnaise(IComponentCombo iComponentCombo){
        super(iComponentCombo);
    }

    private int costMayonnaise(){
        return 100;
    }

    @Override
    public int cost() {
        return super.cost() + costMayonnaise();
    }
}
