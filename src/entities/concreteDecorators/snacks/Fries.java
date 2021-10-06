package entities.concreteDecorators.snacks;

import entities.baseDecorator.AddDecoratorCombo;
import entities.component.IComponentCombo;

public class Fries extends AddDecoratorCombo {
    public Fries(IComponentCombo iComponentCombo){
        super(iComponentCombo);
    }

    private int costFries(){
        return 300;
    }

    @Override
    public int cost() {
        return super.cost() + costFries();
    }
}
