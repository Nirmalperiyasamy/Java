package Interface;

import java.util.Optional;

public class Car {
    enum Type {
        ELECTRIC,
        PETROL
    }

    public static void main(String[] args) {
       // ElectricCarController electric = new ElectricCarController();
       // PetrolCarController petrol = new PetrolCarController();
        Necessary necc = null;
        Type type = Type.ELECTRIC;
        switch (type) {
            case ELECTRIC:
                necc = new ElectricCarController();
                break;
            case PETROL:
                necc = new PetrolCarController();
                break;
        }
        Optional option = Optional.ofNullable(necc);

    }
}
