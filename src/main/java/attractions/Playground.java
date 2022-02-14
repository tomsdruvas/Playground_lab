package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class Playground extends Attraction implements ISecurity {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge() >=12 && visitor.getHeight() >=145){
            return true;
        }
        return false;
    }
}
