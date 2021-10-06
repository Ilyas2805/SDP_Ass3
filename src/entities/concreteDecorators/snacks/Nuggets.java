package entities.concreteDecorators.snacks;

import entities.baseDecorator.AddDecoratorCombo;
import entities.component.IComponentCombo;

public class Nuggets extends AddDecoratorCombo {
    public Nuggets(IComponentCombo iComponentCombo){
        super(iComponentCombo);
    }

    private int costNuggets(){
        return 500;
    }

    @Override
    public int cost() {
        return super.cost() + costNuggets();
    }
}
