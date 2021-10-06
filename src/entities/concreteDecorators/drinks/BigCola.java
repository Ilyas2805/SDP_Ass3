package entities.concreteDecorators.drinks;

import entities.baseDecorator.AddDecoratorCombo;
import entities.component.IComponentCombo;

public class BigCola extends AddDecoratorCombo {
    public BigCola(IComponentCombo iComponentCombo){
        super(iComponentCombo);
    }

    private int costBigCola(){
        return 600;
    }

    @Override
    public int cost() {
        return super.cost() + costBigCola();
    }
}
