package entities.concreteDecorators.drinks;

import entities.baseDecorator.AddDecoratorCombo;
import entities.component.IComponentCombo;

public class MediumCola extends AddDecoratorCombo {
    public MediumCola(IComponentCombo iComponentCombo){
        super(iComponentCombo);
    }

    private int costMediumCola(){
        return 400;
    }

    @Override
    public int cost() {
        return super.cost() + costMediumCola();
    }
}
