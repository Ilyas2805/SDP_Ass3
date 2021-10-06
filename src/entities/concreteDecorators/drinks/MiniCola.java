package entities.concreteDecorators.drinks;

import entities.baseDecorator.AddDecoratorCombo;
import entities.component.IComponentCombo;

public class MiniCola extends AddDecoratorCombo {
    public MiniCola(IComponentCombo iComponentCombo){
        super(iComponentCombo);
    }

    private int costMiniCola(){
        return 250;
    }

    @Override
    public int cost() {
        return super.cost() + costMiniCola();
    }
}
